package homeworkWeek3RB;

import java.util.Scanner;

// this program calculates commission on the basis of the sales amount
public class Answer7SalesComission {
    public static void main(String[] args) {
        Answer7SalesComission rb1 = new Answer7SalesComission();
        rb1.salesCom();

    }
    public void salesCom (){
        int comission;
        Scanner myScan = new Scanner(System.in);
        System.out.print("Sales Id:");
        int salesId = myScan.nextInt();
        System.out.print("Seller's Name:");
        String sellerName = myScan.next();
        System.out.print("Sales Amount:");
        int salesAmt = myScan.nextInt();
        System.out.print("Basic Salary:");
        int basicSal = myScan.nextInt();

        if(salesAmt >= 50000){
            comission = (50000*35)/100;
        } else if (salesAmt >= 30000){
            comission = (30000*20)/100;
        }else if (salesAmt >= 20000){
            comission = (20000*10)/100;
        } else if (salesAmt>=10000){
            comission = (10000*5)/100;
        }else {
            comission = (9999*2)/100;
        }
        System.out.println("Comission:" + comission);
        int grossPay =  basicSal + comission;
        System.out.println("Gross Salary: " + grossPay);

    }
}
