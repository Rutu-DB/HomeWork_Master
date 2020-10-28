package homeworkWeek3RB;

// this program tells us if the array contains a specific value
public class Answer20ContainsValue {
    public static void main(String[] args) {
int []  myArray = {10,15,20,25,30,35,40,45,50,60,65,70,75,80,85,90,95,100};// arrays initialised
        System.out.println(contains(myArray, 0));
        System.out.println(contains(myArray, 10));


    }

    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {

                return true;
            }
        }
        return false;
    }
}