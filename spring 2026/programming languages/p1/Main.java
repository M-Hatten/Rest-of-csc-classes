/*
What does this code do?
- take a series of numbers from the user, all single digit and seperated only by a comma
- put numbers into a dynamic array (list) and print the list on the screen
- finds minimum number
- finds average number
- print both on screen
 */

import java.util.*; 

public class Main{
    public static void main (String[] args){
        //Take user input
        System.out.println("Enter single digit numbers separated by commas: ");
        Scanner myScanner = new Scanner(System.in);
        String userInput = myScanner.nextLine();

        //Initialize the array
        int arrayLen = (userInput.length() / 2) + 1;
        int[] intArray = new int[arrayLen];
        int checker = 0;

        //Pull ints from the input and put them in an array
        for (int i = 0; i < userInput.length(); i++){
            if (userInput.charAt(i) != ','){
                intArray[checker] = userInput.charAt(i) - '0';
                checker += 1;
            }
        }

        //Print out list
        System.out.println("Your numbers are: " + Arrays.toString(intArray));

        //Find minimum
        int mini = intArray[0];
        for (int i = 0; i < arrayLen; i++){
            if (mini > intArray[i]){
                mini = intArray[i];
            }
        }

        //Print minimum
        System.out.println("Minimum number is: " + mini);

        //Find average
        float total = 0;
        for (int i = 0; i < arrayLen; i++){
            total += intArray[i];
        }
        float avgInt = total / arrayLen;

        //print average
        System.out.println("Average is: " + avgInt);
    }
}

