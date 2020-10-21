package total20Programmes;
import java.util.Scanner;
// This class prints area of triangle
public class Answer8AreaOfTriangle {
// Main method begins
    public static void main(String[] args) {
        Answer8AreaOfTriangle rbcall = new Answer8AreaOfTriangle();
        rbcall.areaofTriangle();

    }// new method created
        public void areaofTriangle () {

        double base ;
        double height;

        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter the value of base:  ");
        base = myScan.nextInt();
        System.out.println("Please enter the value of height: ");
        height = myScan.nextInt();
        System.out.println("area of triangle : " + ((base/2)*height));




    }
}
