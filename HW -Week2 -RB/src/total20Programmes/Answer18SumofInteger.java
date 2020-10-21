package total20Programmes;

import java.util.Scanner;

public class Answer18SumofInteger {
    public static void main(String[] args) {
        Answer18SumofInteger rb1 = new Answer18SumofInteger();// object created
        rb1.sum();

    }
    public void  sum(){
        System.out.println("Input an Integer : ");
        Scanner myScan = new Scanner(System.in);
        int a  = myScan.nextInt(); // variable 'a' is assigned value using Scanner object
        int total = 0; // local variable total is assigned value as 0

        while (a> 0){ // While loop
            int reminder = a % 10; // Variable 'a' is divided by 10 to find out remainder
            total = total + reminder; // variable reminder is added to the total variable
            a = a /10; // variable 'a' is divided by 10 to find out the divisible number
            }
        System.out.println("The sum of the digit is : " + total);
    }
}
