package homeworkWeek3RB;

import java.util.Arrays;

// program sorts numeric and string arrays
public class Answer16SortArrays {

    public static void main(String[] args) {

        // array1 = assigned numbers
        int [] my_array1 = {
                12,1,11,2,10,3,9,4,8,5,7,6
        };
        // array 2 = string type
        String [] my_arrya2 = {
                "September","March" , "October", "January" , "April", "November","February", "December","May","July","June",
                "August"
        };
        System.out.println("Original Numeric Array : " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric Array : " + Arrays.toString(my_array1));
        System.out.println("Original String Array :" + Arrays.toString(my_arrya2));
        Arrays.sort(my_arrya2);
        System.out.println("Sorted String Array : " + Arrays.toString(my_arrya2));
    }

}
