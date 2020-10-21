package total20Programmes;

import java.util.Scanner;

public class Answer13AvgOfNo {
    int a, b, c;

    public static void main(String[] args) {
        Answer13AvgOfNo rb1 = new Answer13AvgOfNo();
        rb1.avgOfNo();

    }

    public void avgOfNo() {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter 1st No.: ");
        a = myScan.nextInt();
        System.out.println("Please enter 2nd No.: ");
        b = myScan.nextInt();
        System.out.println("Please enter 3rd No.: ");
        c = myScan.nextInt();
        System.out.println("The Avg of 3 Nos. is " + ((a + b + c) / 3));
    }
}
