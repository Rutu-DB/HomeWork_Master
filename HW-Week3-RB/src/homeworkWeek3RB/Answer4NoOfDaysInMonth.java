package homeworkWeek3RB;
// this program prints days of month

import java.util.Scanner;

public class Answer4NoOfDaysInMonth {
    static int year, day, month; // variables declared globally


    public static void main(String[] args) {
        isLeapYear(year); // static method called in main method
        getDaysInMonth(month, year); // parameterised void method called in main method
        System.out.println("Days in given months are: " + day);
    }

    public static int isLeapYear(int year) {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter the year:");
        year = myScan.nextInt(); // value assigned to scanner


        if (year >= 1 && year <= 9999) { // if satement to check valid year
            if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) { // if statement prints if leap year
                System.out.println(year + "  is a Leap Year");
            } else { // else satement prints if not a leap year
                System.out.println(year + " is not a Leap Year");
            }
        } else { // else statement from the top if  - not a valid year
            System.out.println("This is not a valid year");
        }
        return year; // returns year to main method
    }

    public static void getDaysInMonth(int month, int year) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Month:");
        month = input.nextInt(); // variable assigne to scanner input
        System.out.println("Please enter Year:");
        year = input.nextInt(); // variable assigned to scanner input

        if (month < 1 || month > 12) { // if satement to check if valid month
            System.out.println(month + "is invalid Month");
        } else if (year < 1 || year > 9999) { // else if to check valid year
            System.out.println(year + "is invalid Year");

        } else { // else if true
            switch (month) { // switch statement clubs if it has  31 days
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    day = 31;
                    break;
                case 2:
                    if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
                        day = 29;
                    } else {
                        day = 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    day = 30;
                    break;
            }
        }

    }
}


