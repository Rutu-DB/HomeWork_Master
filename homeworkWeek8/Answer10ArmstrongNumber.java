package homeworkWeek8;

import java.util.Scanner;
// This program checks if the given number is Armstrong Number
public class Answer10ArmstrongNumber {
    public static void main(String[] args) {
        int  num, number, temp, total =0;
        System.out.println("Pleae enter  3 digits number");
        Scanner mySc = new Scanner(System.in);
        num = mySc.nextInt();
        mySc.close(); // Scanner Closed
        number = num;

        for( ;number!=0;number /= 10)  //for loop not initialised, checks if not zero,
        {
            temp = number % 10; // number is divisible by 10
            total = total + temp*temp*temp;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");

    }
}
