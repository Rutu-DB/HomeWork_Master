package total20Programmes;

import java.util.Scanner; // Scanner class imported
// Class begins
public class Answer14PrintAreaPerim {
    float width =  5.6f; // instance variable
    float height = 8.5f; // instance variable
    double area; // instance variable
    double perimeter; // instance variable
//Main method begins
    public static void main(String[] args) {
        Answer14PrintAreaPerim rb1 = new Answer14PrintAreaPerim(); // object created using class
        System.out.print("Area is ");
        rb1.formulaArea(); // called area method using object
        System.out.print("Perimeter is ");
        rb1.formulaPeri(); // called perimeter method using object

    }
    public void formulaArea (){
        System.out.println(area = width * height); // instance variable used from instance area
    }
    public void formulaPeri (){
        System.out.println(perimeter = 2*(width + height)); // instance variable used from global area
    }

}

