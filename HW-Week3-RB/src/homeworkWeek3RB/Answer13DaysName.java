package homeworkWeek3RB;

import java.util.Scanner;
// This program tells us the  name of Days using Switch Statement
public class Answer13DaysName {
    public static void main(String[] args) {
        Answer13DaysName callNameOfTheDay = new Answer13DaysName();
        callNameOfTheDay.nameOfTheDay();

    }
    public void nameOfTheDay (){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any number between 1 to 7 : ");
        int a = input.nextInt();
        switch (a) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }
    }
}
