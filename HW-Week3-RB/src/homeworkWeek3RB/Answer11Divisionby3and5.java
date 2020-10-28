package homeworkWeek3RB;
// this program prints numbers that are divisible by 3,5 and  3 & 5
public class Answer11Divisionby3and5 {
    public static void main(String[] args) {
        System.out.println("No. divisible by 3 : ");
        int i; // declared i variable
        for( i = 1;i<=100; i++){ // for loop intialised, goes upto 100 and increments
            if(i %3 == 0){ // if condition checks if i is divisible by 3
                System.out.print(i + " ");// prints the result
            }

        }
        System.out.println(" ");
        System.out.println("No. divisible by 5 : ");
        for(i = 1; i <=100; i++){ // for loop initialised,  goes upto 100 and increments
            if(i % 5 == 0){ // if statement checks if i is divisible by 5
                System.out.print(i + " "); // prints the result
            }
        }
        System.out.println( " ");
        System.out.println("No. divisible by 3 and 5 : ");
        for (i = 1 ; i <=100; i ++ ){// for loop initialised , goes upto 100 and increments
            if(i % 3 ==0 || i % 5 ==0){//if statement using OR condition, if it true then prints
                System.out.print(i + " ");
            }
        }

    }
}
