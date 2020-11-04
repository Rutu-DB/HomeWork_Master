package homeworkWeek8;

import java.util.Scanner;
//this program adds upt the digit given
public class DigitSumChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int number = input.nextInt();
        System.out.println("The sum of digit is: " + sumDigit(number));


    }
    public static int sumDigit(int number) {
        int add = 0;
    while (number != 0){
        add += number % 10;
        number /= 10;
    }
    return add;
    }

}
