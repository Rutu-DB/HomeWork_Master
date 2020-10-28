package homeworkWeek3RB;

import java.util.Scanner;

// This program prints employees salary slip
public class Answer5EmpSalSlip {

    public static void main(String[] args) {
        Answer5EmpSalSlip callSalSlip = new Answer5EmpSalSlip();
        callSalSlip.salSlip();
    }

    public void salSlip() {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Employee Id : ");
        int empId = myScan.nextInt();
        System.out.print("Employee Name : ");
        String empName = myScan.next();
        System.out.print("Basic Salary : ");
        int basicSal = myScan.nextInt();

        float hra = ((basicSal * 10) / 100);
        float ta = ((basicSal * 8 )/100);
        float da = ((basicSal*9)/100);
        float pf = ((basicSal*20)/100);
        float grossSal = ((basicSal + hra + ta + da)- pf);


        System.out.println("\n\t\tSalary Slip\n" +
                "------------------------------------\n" +
                "\tEmployee Id  :\t\t:\t" + (empId) + "\n" +
                "\tEmployee Name:\t\t:\t" + (empName) + "\n" +
                "-------------------------------------\n" +
                "\tBasic Salary :\t\t:\t" + (basicSal) + "\n" +
                "\tHRA 10%      :\t\t:\t" + (hra) + "\n" +
                "\tTA 8%        :\t\t:\t" + (ta) + "\n" +
                "\tDA 9%        :\t\t:\t" + (da) + "\n" +
                "\tPF -20%      :\t\t:\t" + (pf) + "\n" +
                "-------------------------------------\n" +
                "\tGross Salary :\t\t:\t" + (grossSal) + "\n" +
                "-------------------------------------\n" );


    }
}
