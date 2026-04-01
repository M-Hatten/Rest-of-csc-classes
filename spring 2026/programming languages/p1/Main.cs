/*
What does this code do?
- take a series of numbers from the user, all single digit and seperated only by a comma
- put numbers into a dynamic array (list) and print the list on the screen
- finds minimum number
- finds average number
- print both on screen
 */

using System;

class PiratesLoveTheC{
    public static void Main(string[] args){
        //Take user input
        Console.Write("Enter single digit numbers separated by commas: ");
        string usrInput = Console.ReadLine();

        //Initialize the array
        int arraySize = (usrInput.Length / 2) + 1;
        int[] intArray = new int[arraySize];
        int check = 0;

        //Pull ints from the input and put them in an array
        foreach (char c in usrInput){
            if (!c.Equals(',') && check < intArray.Length){
                intArray[check] = c - '0';
                check++;
            }
        }

        //Print out list
        Console.Write("Your numbers are: ");
        foreach(int x in intArray){
            Console.Write(x + ", ");
        }

        //Find minimum
        int mini = intArray[0];
        foreach(int x in intArray)
        {
            if (mini > x)
            {
                mini = x;
            }
        }

        //Print minimum
        Console.WriteLine("\nMinimum number is: " + mini);

        //Find average
        float total = 0;
        foreach (float x in intArray)
        {
            total += x;
        }

        float avgInt = total / arraySize;

        //print average
        Console.WriteLine("Average is: " + avgInt);
    }
}
