package homeworkWeek8;

import java.util.Scanner;

// this program checks if the given number is a prime number
public class Answer12PrimeNumber {
    public static void main(String[] args) {
        int temp;
        boolean isPrime = true;
        Scanner mySc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        // stores the input in an integer
        int num = mySc.nextInt();
        mySc.close();
        // loop intialised to 2, compares i with user input divided by 2
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i; // stores result to temp with/without remainder
            if (temp == 0) { // if temp is exact match as 0 which means this is not a prime number
                isPrime = false;//assigns value as false
                break;// ends loop and comes out
            }
        }
        // if it is a prime number then print as a prime number or else prints not a prime number
        if (isPrime) {
            System.out.println(num + " is a prime number");

        } else {
            System.out.println(num + " is not a prime number");
        }

    }
}


