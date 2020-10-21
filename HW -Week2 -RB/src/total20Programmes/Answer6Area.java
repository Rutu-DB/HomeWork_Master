package total20Programmes;

import java.util.Scanner; // Scanner Class imported

public class Answer6Area {
// Scanner initialisation to mySc object
    static Scanner mySc = new Scanner(System.in);
// main method begins
    public static void main(String[] args) {
    Answer6Area objRB = new Answer6Area(); // object created to call Area Method
    objRB.findArea();
    } // new method
    public void findArea(){
        System.out.println("Please enter radius:-");
        int a = mySc.nextInt(); // scanner assigned to variable
        double area = ((Math.PI)* (a*a)); // variable assigned
        System.out.println("your area is : " + area);
    }
}

