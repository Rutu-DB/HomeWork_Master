package homeworkWeek3RB;
// This program calculates sum of arrays
public class Answer17SumOfArray {
    public static void main(String[] args) {
        int [] myArray = {1,3,5,7,9,2,4,6,8,10};// arrays initialisd
        int sum =0;
        for( int i : myArray)
            sum +=i;
        System.out.println("Sum of Array no is : " +  sum);
    }}
