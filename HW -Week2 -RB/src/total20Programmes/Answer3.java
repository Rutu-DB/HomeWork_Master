package total20Programmes;
//This class calls static and instance variable using static and instance method
public class Answer3 {
    static int x = 30; // static variable
    int y = 50; //instance variable
// main method begins
    public static void main(String[] args) {

        Answer3 callAddition = new Answer3(); // Object created to call instance method
        callAddition.addition(); // object called from instance method
        substraction();// static method called

    }
// instance method begins
    public void addition() {
        System.out.println("Value of x = " + x);
        System.out.println("Value of y = " + y);
        System.out.println("Sum of instance Method =" + (x + y));
    }
// static method begins
    public static void substraction() {
        Answer3 r1 = new Answer3();
        System.out.println("Substraction from static Method of y = " + (x - r1.y));

    }
}
