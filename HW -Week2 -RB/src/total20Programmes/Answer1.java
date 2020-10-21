package total20Programmes;
// This calls 2 instance variable in the main method
public class Answer1 {
    int a = 10; // instance variable
    int b = 20; // instance variable

    public static void main(String[] args) {
        Answer1 obj = new Answer1(); // created object
        obj.instMethod(); // instance method called in main using obj
    }
    public void instMethod (){
        System.out.println(a);// instance variable 'a' called in method
        System.out.println(b); // instance variable 'b' called in method

    }
}
