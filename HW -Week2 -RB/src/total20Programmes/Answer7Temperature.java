package total20Programmes;

import java.util.Scanner; // scanner class imported
// This class prints the Farenheit to Celcius Temperature
public class Answer7Temperature {

     Scanner mySCan = new Scanner(System.in); // Scanner has been assigned to object

    public static void main(String[] args) {
    Answer7Temperature objRB = new Answer7Temperature(); // object initlialised
    objRB.findTemp();
    }
    public void findTemp (){
        System.out.println("Please enter the Fahrenheit temp: ");
        int f = mySCan.nextInt();
        float ftemp = ((f-32) * 5/9);
        System.out.println("Tempertature in Celcius is : " + ftemp);

    }

}

