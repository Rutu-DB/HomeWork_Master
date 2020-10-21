package total20Programmes;

import java.util.Scanner; // Scanner Util
//Class begins
public class Answer16BinaryAddition {
// Main method begins
    public static void main(String[] args) {
        Answer16BinaryAddition rb1 = new Answer16BinaryAddition(); //  object created
        rb1.convertBinaryToInteger();// method  called using object
    }
    // Method created
    public void convertBinaryToInteger(){
        String x; // Local Variable created
        String y; // Local Variable created
        int total; // Local Variable created
        Scanner in = new Scanner(System.in); // Scanner intialised
        System.out.println("Input First Binary Number: ");
        x = in.nextLine(); // runtime value assigned to variable 'x'
        int a = Integer.parseInt(x, 2); // Variable parsed using method and converted to integer
        System.out.println("Input Second Binary Number: ");
        y = in.nextLine(); // runtime value assigned to variable 'y'
        int b = Integer.parseInt(y, 2); // variable parsed using method and converted to integer
        total = a + b; // Variable 'a' and 'b' value assigned to total
        System.out.println("Sum of 2 Binary numbers : " + Integer.toBinaryString(total) );// answer printed using parsing total variable to integer
    }

}
