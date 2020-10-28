package homeworkWeek3RB;
//This program tells whether the year is a leap year or not?

import java.util.Scanner;

public class Answer2LeapYear {
    public static void main(String[] args) {
        year(); // called static method

    }

    public static int year() {
        Scanner myScan = new Scanner(System.in); // called scanner
        System.out.println("Please enter the year: ");
        int year = myScan.nextInt(); // assigned value to scanner
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) { // if statement using logical operators
            System.out.println(year + "  is a Leap Year");
        } else
            System.out.println(year + " is not a Leap Year");
        return year; // method returned
    }
}
