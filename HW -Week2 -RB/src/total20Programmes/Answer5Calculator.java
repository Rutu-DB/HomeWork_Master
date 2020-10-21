package total20Programmes;
// Class begins
public class Answer5Calculator {
    int a, b, total, total1; // Variables declared but not assigned any value

// Main method begins
    public static void main(String[] args) {
        Answer5Calculator callAddition1 = new Answer5Calculator();
        callAddition1.addition1(10, 20);
        System.out.println("Subtraction of two numbers :" + subtraction1(50, 30));
        callAddition1.multiplication();
        System.out.println("Division of two numbers :" + division1());
    }

    // Addition method - with Parameters and no return type
    public void addition1(int a, int b) {
        System.out.println("Sum of  given two numbers :" + (total = a + b));
    }

    // Subtraction method  - with Parameters and with return type
    public static int subtraction1(int a, int b) {
        return a - b;


        }
    // multiplication method - no parameters and no return type
        public void multiplication (){
        a= 10; //
        b = 25;
            System.out.println("Multiplication of two numbers:" + (a*b));

                }
// division method - no parameters with return type
    public static int division1 (){
        int a = 30;
        int b = 3;
        return(a/b);
    }
    }