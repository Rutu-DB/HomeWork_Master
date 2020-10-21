package total20Programmes;

import java.util.Scanner;
// mAIN CLASS
public class Answer9ConvertCase {
    String upper; //Global Variable declared
    String lower; // Global variabke declared
// MAIN METHOD
    public static void main(String[] args) {
        Answer9ConvertCase rb1 = new Answer9ConvertCase();
        rb1.upperToLower();
    }
    // CONVERT METHOD
    public void upperToLower() {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter Upper Case name: ");
        upper = myScan.nextLine();
        lower = upper.toLowerCase();
        System.out.println(lower);
    }
}
