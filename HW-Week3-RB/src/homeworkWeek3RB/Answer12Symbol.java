package homeworkWeek3RB;
// this program tells us input value is symbol, alphabet or number.

import java.util.Scanner;

public class Answer12Symbol {
    public static void main(String[] args) {
    Answer12Symbol callSymbol = new Answer12Symbol();
    callSymbol.symbol();
    }
    public  void  symbol (){
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a value: ");
        char a =  input.next().charAt(0);
        if((a >=65 && a<= 90) ||(a >= 97 && a <=122)){ // used ASCII values
            System.out.println(a + " is alphabet");
        } else if (a >=48 && a<= 57){ // used ASCII values
            System.out.println(a + " is a number");
        } else{
            System.out.println(a + " is a special character");
        }
        }
    }

