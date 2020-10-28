package homeworkWeek3RB;

import java.util.Scanner;

// This program tells us whether the input is Even or Odd No. using turnery operator
public class Answer1OddEven {

    public static void main(String[] args) {
        Answer1OddEven callGetNo = new Answer1OddEven();
        callGetNo.getNo(); // called method

    }

    public void getNo() {
        Scanner myScan = new Scanner(System.in); // called scanner
        System.out.println("Please enter a number:");
        int a = myScan.nextInt(); // assigned value to a variable
        String result = (a % 2 == 0) ? "Even Number" : "Odd Number"; // used Turnery operators
        System.out.println(a + " is " + result);
    }

}
