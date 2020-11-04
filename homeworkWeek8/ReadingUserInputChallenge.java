package homeworkWeek8;

import java.util.Scanner;

// This program reads 10 number from console and adds
public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        int i = 0, b = 10, sum = 0;
        int[] a = new int[b]; // Arrays declaration and initialisation
        Scanner in = new Scanner(System.in);
        while (i < b) {
            System.out.print("Please enter the number " + (i + 1) + ": ");
            if (in.hasNextInt()) { // condition to check if user is inputing integer only
                a[i] = in.nextInt(); // storing values in array using scanner
                sum += a[i]; // adding vaules from arrays
                i++; // incrementing
            } else {
                System.out.println("Invalid Number"); // if false prints error message
                break;// ends while loop
            }

        }
        in.close(); // scanner closed
        System.out.println("Sum of the number given :" + sum);

    }

}
