package homeworkWeek8.carpetCostCalculator;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            char choice;
            Scanner input = new Scanner(System.in);
            do {
                    System.out.println(" Please enter Length: ");
                    double length = input.nextDouble();
                    System.out.println("Please enter Width: ");
                    double width = input.nextDouble();
                    System.out.println("Please enter the cost: ");
                    double cost = input.nextDouble();

                    Carpet carpet = new Carpet(cost);
                    Floor floor = new Floor(width, length);
                    Calculator calculator = new Calculator(floor, carpet);
                    System.out.println("Total = " + calculator.getTotalCost());


                    System.out.println("Do you wish to continue? Enter Y/N: ");
                    choice = input.next().charAt(0);
            } while (choice =='Y' || choice == 'y');

        }

}
