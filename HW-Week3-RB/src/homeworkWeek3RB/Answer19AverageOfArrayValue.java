package homeworkWeek3RB;
// this program calculates the average of arrays

public class Answer19AverageOfArrayValue {
    public static void main(String[] args) {
        double [] avgArray = {1.25,2.3 ,3.75,4.65,5.7,0.2,6.15,7.5,8.254,9.24,10.09}; //
        double total = 0;
        for (int i=0; i< avgArray.length;i++){ // loop begins
            total = total + avgArray[i];
        }
            double avg = total/ avgArray.length;
        System.out.format("The average of Array values : %.2f", avg);
        }
    }


