package total20Programmes;

import java.util.Scanner; // called scanner class
// class begins
public class Answer10TT {
//Main method begins
    public static void main(String[] args) {
        int a; // local variable
        Scanner myScan = new Scanner(System.in); // Scanner object created

        System.out.println("Please input the multiplier");
        a = myScan.nextInt(); // value assigned to variable 'a'
        // for loop begins
        for (int i = 0; i <= 10; i++) {
            System.out.println(a + " x " + (i + 1) + " = " + (a * (i + 1)));

        }

    }
}
