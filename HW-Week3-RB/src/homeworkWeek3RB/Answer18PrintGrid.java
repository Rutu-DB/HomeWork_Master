package homeworkWeek3RB;
// this program print a 2 dimensional grid.
public class Answer18PrintGrid {
    public static void main(String[] args) {
        int[][] a = new int[5][14];
        for (int i = 0; i < 5; i++) {// 1st for loop begins
            System.out.println("");
            for (int j = 0; j < 14; j++) { // 2nd loop begins
                System.out.printf("-", a[i][j]);
            }// 2nd loop ends
        }// 1st loop ends
        System.out.println("");
    }
}
