package total20Programmes;

import java.util.Scanner;
// class begins
public class Answer17DecimalToBinary {
// main method begins
    public static void main(String[] args) {
        Answer17DecimalToBinary rb1 = new Answer17DecimalToBinary(); // object created
        rb1.convertToDecimal(); // object called

    }// Converting method begins
    public void convertToDecimal() {
        String a; // local variable
        int b; // local variable
        Scanner myScan = new Scanner(System.in); //Scanner intialised
        System.out.println("Please enter a Decimal No.: ");
        b =  myScan.nextInt(); // variable 'b' is holding decimel
        a = Integer.toBinaryString(b);//
        System.out.println("Binary Conversion is :" + a);


    }
}
