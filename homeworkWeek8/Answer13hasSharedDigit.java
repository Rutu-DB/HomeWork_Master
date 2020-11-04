package homeworkWeek8;

import java.util.Scanner;
// This program prints the shared number if its true
public class Answer13hasSharedDigit {
    public static void main(String[] args) {
        System.out.println("Please enter number1: ");
        Scanner mySc = new Scanner(System.in);
        int num3 = mySc.nextInt();
        System.out.println("Please enter number2: ");
        int num4 = mySc.nextInt();
        System.out.println("The out put of Shared Digit is : " + hasSharedDigit(num3,num4));

    }


    public static boolean hasSharedDigit(int num1, int num2){
        if((num1>=10 && num1<=99) && (num2>=10 && num2<=99)){
            return true;
        }else {
            return false;
        }
    }
}
