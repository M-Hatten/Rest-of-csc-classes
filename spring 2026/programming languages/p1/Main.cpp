/*
What does this code do?
- take a series of numbers from the user, all single digit and seperated only by a comma
- put numbers into a dynamic array (list) and print the list on the screen
- finds minimum number
- finds average number
- print both on screen
 */

 /*
 HEY DR. CHERRY!!!!
 So I know it's bad form to turn in code without testing it, but I haven't been able to find a workaround to get it to not have the issue I showed you in class.
 I have no clue why initializing a string is causing this program to not give any output, but it is comforting to know you're just as baffled as I am
 I still wrote the code based on what I already know about the language and I really hope it works, but since I obviously can't test it, I have no guarauntees
 I will say I didn't get any compilation errors, but that's only half of troubleshooting code
 If you can get it to give an output, can you let me know? I've run it on both my laptop and my PC and I've come up empty with both
 */
#include <iostream>
#include <string>
using namespace std;

int main(){
    //Take user input
    cout << "Enter single digit numbers separated by commas: " << endl;
    
    string usrInput("");
    
    getline(cin, usrInput);

    //Initialize the array
    const int arrayLen = (usrInput.size() / 2) + 1;
    int* intArray = new int[arrayLen]; 

    //Pull ints from the input and put them in an array
    int checker = 0;
    for (int i = 0; i < usrInput.size(); i++){
        if (usrInput[i] != ','){
            intArray[checker] = usrInput[i] - '0';
            checker++;
        }
    }

    //Print out list
    cout << "Your numbers are: " << endl;
    for (int i = 0; i < checker; i++){
        cout << intArray[i] << ", " << endl;
    }

    //Find minimum
    int mini = intArray[0];
    for (int i = 0; i < checker; i++){
        if (mini > intArray[i]){
            mini = intArray[i];
        }
    }

    //Print minimum
    cout << "Minimum number is: " << mini << endl;

    //Find average
    float total = 0.0;
    float numOfNums = checker;
    for (int i = 0; i < checker; i++){
        total += intArray[i];
    }
    float avg = total / numOfNums;

    //print average
    cout << "Average is: " << avg << endl;

    delete[] intArray;
    
   return 0;
   
}



