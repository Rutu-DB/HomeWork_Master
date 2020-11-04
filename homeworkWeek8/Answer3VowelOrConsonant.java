package homeworkWeek8;

import java.util.Scanner;
//This program takes input from user and prints wheather a given character is Vowel or Consonants
public class Answer3VowelOrConsonant {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a character : ");
        char ch =inp.next().charAt(0);  // scanner variable assigned
        ch= Character.toLowerCase(ch);// converts user input to lowercase



        if(ch >= 0 && ch <=9){ // checks if a character is a number
            System.out.println("Invalid Input");
        }else if( ch == 'a'|| ch =='e'||ch == 'i'|| ch=='o' ||ch=='u'){
            System.out.println(ch + " is a vowel");
        }
        else{
            System.out.println(ch + " is a consonant");
        }

    }




}

