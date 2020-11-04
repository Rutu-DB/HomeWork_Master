package homeworkWeek8;

//  This program prints a right angled triangle  - printing numbers as output
public class Answer6TriangleWithNo {
    public static void main(String[] args) {
        int r,r1, num, n=10;

        for (r =0; r<n;r++){ // outer loop for rows
            num = 1;// number assigned as 1
            for (r1 =0; r1<=r; r1++){ // inner loop for column
                System.out.print(num + ""); // prints number on the same line
                num++; // increments number
            }
            System.out.println();// brings the cursor to the next line after printing each row.
        }
    }
}
