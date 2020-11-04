package homeworkWeek8;

import java.util.Scanner;
//  this
public class Answer11EvenDigitSum {
    public static void main(String[] args) {
// declare variables
        int number = 0;
        int sumOfEvenDigits = 0;

        // create Scanner class object for reading values
        Scanner mySc = new Scanner(System.in);

        System.out.println("Please enter an integer number");
        number = mySc.nextInt();
// find sum of digits of number
        sumOfEvenDigits = getEvenDigitSum(number);

        // display result
        System.out.println("The sum of even digits of " + "the number "+ number + " = "+ sumOfEvenDigits);

        // close Scanner class object
        mySc.close();
    }



    public static  int getEvenDigitSum (int number){
        //  declare variables
        int lastDigit = 0;
        int evenDigitSum = 0;
        // loop to repeat the process
        if(number <0){
            return -1;

        }
        while(number !=0){
            //find the last digit
            lastDigit= number%10;
            // check if last digit is even
            if (lastDigit%2 ==0){
                // add it to sum
                evenDigitSum += lastDigit;
            }
            // remove last digit of number
            number = number/10;
        }
        // return sum value
        return evenDigitSum;
    }
}
