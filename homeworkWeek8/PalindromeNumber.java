package homeworkWeek8;
// This program checks if the series is a Palindrome number
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner mySc = new Scanner(System.in);
        int i = mySc.nextInt();
        System.out.println(isPalindrome(i));
    }

    public static boolean isPalindrome(int number) {
        boolean check = true;
        int sum = 0, r = 0;
        int temp = number;
        while (temp != 0) { // While loop begins
            r = temp % 10;
            sum = (sum * 10) + r;
            temp = temp / 10;
        }
        if (number == sum) {
            check = true;
            System.out.println("It is a Palindrome number.");
        } else {
            check = false;
            System.out.println("Not a palindrome");
        }
        return check;
    }
}