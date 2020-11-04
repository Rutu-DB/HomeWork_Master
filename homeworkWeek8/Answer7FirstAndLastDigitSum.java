package homeworkWeek8;

import java.util.Scanner;
// this program adds first and last digit of a given number
public class Answer7FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println("Please enter any number: ");
        Scanner mySc = new Scanner(System.in);
        int i = mySc.nextInt();
        System.out.println(sumFirstAndLastDigit(i));
    }
    public static int sumFirstAndLastDigit (int number){
        int a =number;
        if(a<0){ //  if statement to check if number is less than 0 or a negative number
            System.out.print("This is invalid number");
            return -1; // returns - 1 if true
        }
        int lastdigit = number % 10; // returns division remainder
        while (a>=10){
            a = a/10;

        }
        int firstdigit = a;
        System.out.println(" the sum of given number is : ");
        return firstdigit+ lastdigit;


    }
}
