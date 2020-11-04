package homeworkWeek8;
// This program prints a right angled triangle using '@' symbol.
public class Answer8RightAngledTriangleSymbolAt {
    public static void main(String[] args) {


        int i, j, num, n = 6;

        for (i = 0; i < n; i++) { // outer loop for row
            num = 1;
            for (j=0;j<i; j++){ // inner loop for column
                System.out.print("@");// prints @ at the same line

            }
            System.out.println(); // bring cursor to the next row

        }
    }
}