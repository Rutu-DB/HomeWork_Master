package homeworkWeek8;
// this program prints diamond
public class Answer14PrintsDiamond {
    public static void main(String[] args) {
        diamond();
    }

    private static void diamond() {
        int i = 1;
        int j;

        //ascends the ascends
        while (i <= 7) {
            j = 1;
            while (j++ <= 7 - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
        // descends the the diamond
        i = 7 - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= 7 - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }
}