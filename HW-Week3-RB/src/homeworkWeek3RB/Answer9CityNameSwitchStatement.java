package homeworkWeek3RB;

import java.util.Scanner;

public class Answer9CityNameSwitchStatement {


    public static void main(String[] args) {
        Scanner rb1 = new Scanner(System.in);
        String any;
        System.out.print("Enter any alphabet between 'a' and 'f' : ");
        any = rb1.next();
        System.out.println(cityName(any));


    }

    public static String cityName(String any) {
        String city = "";
        String str1 = any.toLowerCase();
        switch (str1) {
            case "a":
                city = "Amsterdam";
                break;
            case "b":
                city = "Barcelona";
                break;
            case "c":
                city = "Cannes";
                break;
            case "d":
                city = "Denmark";
                break;
            case "e":
                city = "Egypt";
                break;
            case "f":
                city = "France";
                break;
            default:
                System.out.println("Invalid selection.");
        }
        return city;
    }
}