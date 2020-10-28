package homeworkWeek3RB;

import java.util.Scanner;
// this program find even or odd numbers
public class Answer6OddOrEven {
    public static void main(String[] args) {
        Answer6OddOrEven rb1 = new Answer6OddOrEven();
        rb1.checkNo();
    }

    public void checkNo() {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Please enter any Number:");
        int myNo = myScan.nextInt();

        if ((myNo % 2) == 0) {
            System.out.println(myNo + " is even number");
        } else {
            System.out.println(myNo + "is odd number");
        }

    }
}
