package homeworkWeek3RB;

import java.util.Scanner;

// this program takes user input and performs arithmetic calculation
public class Answer10ArithmeticCalculation {


    public static void main(String[] args) {
        char symb;
        double n1,n2,out;
        Scanner myScan = new Scanner(System.in);
        System.out.print("Please enter first no: ");
         n1= myScan.nextDouble();
        System.out.print("Please enter second no: ");
        n2 = myScan.nextDouble();
        System.out.print("Please choose any operators (+,-,*,/) : ");
        symb = myScan.next().charAt(0);

        out = calculation (n1,n2,symb);
        System.out.println(n1 + " "+ symb + " " + n2 + " = " + out );

    }
    public static double calculation(double n1, double n2, char symb){
        double output = 0;
        if(symb == '+') {
            output = n1 + n2;
            } else if (symb == '-'){
            output= n1-n2;
        }else if (symb == '*') {
            output= n1*n2;
        }else if (symb == '/'){
            output= n1/n2;
        }else
            System.out.println("Invalid input");
        return output;
    }
}
