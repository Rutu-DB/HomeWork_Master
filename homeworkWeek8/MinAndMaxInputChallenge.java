package homeworkWeek8;

import java.util.Scanner;
// this program takes input from user, compares and prints minimum or maximum number
public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        int intInput;
        int currentMin = Integer.MIN_VALUE;
        int currentMax = Integer.MAX_VALUE;


        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers would you like to compare:  ");
        intInput = input.nextInt();
        int[] a = new int[intInput]; // array declaration
        for (int i = 0; i < intInput; i++) { //for loop taking user inputs
            System.out.print("Please enter " + (i + 1) + " :");
            a[i] = input.nextInt(); // storing in arrays
        }

        while (intInput != 0) { // endless while loop
            currentMin = a[0];
            currentMax = a[0];
            for (int i = 0; i < intInput; i++) { // for loop checking numbers
                if (currentMin > a[i]) {
                    currentMin = a[i];

                }
                if (currentMax < a[i]) {
                    currentMax = a[i];

                }

            }break;
        }
        System.out.println();
        System.out.println("Minimum No is : " + currentMin);
        System.out.println("Maximum No is : " + currentMax);


    }
}