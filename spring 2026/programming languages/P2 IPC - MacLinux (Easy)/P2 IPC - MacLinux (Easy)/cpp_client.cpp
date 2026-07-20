/////////////////////////////////////////////////////
// Milo Hatten
// 4/1/2026
// Program 2 - C++ File
/////////////////////////////////////////////////////

#include <iostream>
#include <fstream>
#include <string>
#include <thread>
#include <chrono>       // For timers
#include <vector>
#include <tuple>
#include <cstdlib>
#include <unistd.h>

using namespace std;

const string OUT = "/tmp/multi-lang-assignment-client2server";
const string IN = "/tmp/multi-lang-assignment-server2client";

void writeMessage(const string &msg){
    ofstream writer(OUT);
    if (writer.is_open()){
        writer << msg; //write the message
        writer.flush(); //flush that output
    }
    else{
        cout << "Error! Error! Error opening pipe! Beep boop!" << endl; //error handling
    }
    this_thread::sleep_for(chrono::milliseconds(100)); //adding in a delay

}

string readMessage (){ 
    //timeout in ms
    int timeout = 2000; 
    string output;
    auto start = chrono::steady_clock::now();

    while (chrono::duration_cast<chrono::milliseconds>(chrono::steady_clock::now() - start).count() < timeout){
        ifstream reader(IN);
        if (reader.is_open()) {
            if (getline(reader, output)) {    // Read one line
                reader.close();
                return output;
            }
            reader.close();
        }
        this_thread::sleep_for(chrono::milliseconds(100));
    }
    return output;
}

int main(int argc, char* argv[]){
    //i couldn't pick what color to use
    const string GREEN = "\033[32m";
    const string RESET = "\033[0m";
    const string CYAN = "\033[36m";
    const string PURPLE = "\033[35m";


    //send name so server knows this is c++
    string intro = "name|C++\n";
    writeMessage(intro);

    //silly little numbers to operate on
    vector<tuple<string, int, int>> ops = {
    {"add", 400, 20}, //should give 420
    {"mul", 23, 3}, //should give 69
    {"sub", 3465, 3398}, //should give 67
    {"div", 504, 12} //should give 42
   };

   for (auto &op : ops){
    string opName;
    int arg1, arg2;
    tie (opName, arg1, arg2) = op;

    string command = opName + "|" + to_string(arg1) + "|" + to_string(arg2) + "\n";
    writeMessage(command);
    string response = readMessage();

    cout << CYAN << "C++: recieving response from c#, " << opName << "(" << arg1 << ", " << arg2 << ") = " << response << RESET << "\n\n";

    
   }
    string closeCommand = "close\n";
    writeMessage(closeCommand);
    
    if (argc > 1 && string (argv[1]) == "end"){
        string endCommand = "end\n";
        writeMessage(endCommand);
        exit(0);
    }

   return 0;
}