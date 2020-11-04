package homeworkWeek8;
// this program prints Left angled triangle
public class Answer15LeftAngledTriangle {

    public static void main (String args [])
    {
        int rows = 5;

        for (int x = 1; x <= rows; x++)// loop for  rows
        {
            for (int i = 1; i <= x; i++) // loop for column
            {
                System.out.print("* ");
            }

            System.out.println("");
        }
    }
}
