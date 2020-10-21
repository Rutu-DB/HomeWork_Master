package total20Programmes;
// Class begins
public class Answer15SwapVar {
int x = 10; // Variable declared in instance area
int y = 20; // variable declared in instance area
int temp; // variable declared in instance area

    public static void main(String[] args) {
        int a = 30; // variable declared in main
        int b = 40; // variable declared in main
        int temp2; // variable declared in main
        System.out.println("values before swapping: " + a +" " + b); // local variable printed before swapping

         temp2 = a; // swapped variable values
         a = b; // swapped variable values
         b = temp2; // swapped variable values
        System.out.println("values after swapping : "+ a + " " + b ); // local variable printed after swapping

    }


}
