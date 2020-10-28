package homeworkWeek3RB;

import java.util.Scanner;
// This program prints Marksheet.
public class Answer3MarkSheet {
    String result, grade;

    public static void main(String[] args) {

        Answer3MarkSheet callmarkSheet = new Answer3MarkSheet(); //  object created
        callmarkSheet.markSheet(); // called void method
    }

    public void markSheet() {
        Scanner myScan = new Scanner(System.in); // called scanner
        System.out.print("Name     :      ");
        String name = myScan.nextLine(); // value assigned to scanner
        System.out.print("Roll No. :");
        int rollNo = myScan.nextInt(); // value assigned to scanner
        System.out.print("Enter Maths Score:");
        int mathScore = myScan.nextInt(); // value assigned to scanner
        System.out.print("Enter Science Score:");
        int sciScore = myScan.nextInt(); // value assigned to scanner
        System.out.print("Enter English Score:");
        int engScore = myScan.nextInt(); // value assigned to scanner

        if (mathScore >= 0 && mathScore <= 100) { // if condition to check the valid math Score
            if (sciScore >= 0 && sciScore <= 100) { // if condition to check valid Science Score
                if (engScore >= 0 && engScore <= 100) { // if condition to check valid english score

                    int total = (mathScore + sciScore + engScore);
                    float percentage = (float) ((100 * total) / 300);

                    if (percentage < 35) { // if condition checks the percentage criteria
                        result = "Fail";
                        grade = "N/a";

                    } else if (percentage >= 35) { // else if to check percentage criteria
                        result = "Pass";
                        grade = "C";
                        if (percentage >= 50) { // if to check percentange criteria
                            result = "Pass";
                            grade = "B";
                            if (percentage >= 60) { // if to check percentage criteria
                                result = "Pass";
                                grade = "A";

                                if (percentage >= 80) { // if to check percentage criteria
                                    result = "Pass";
                                    grade = "A+";
                                }
                            }
                        }
                    }

                    System.out.println("\n\t\tMark Sheet\n" +
                            "-----------------------------\n" +
                            "\tName\t\t:\t" + (name) + "\n" +
                            "\tRoll No\t\t:\t" + (rollNo) + "\n" +
                            "------------------------------\n" +
                            "\tSubjects\t\tMarks\n" +
                            "------------------------------\n" +
                            "\tMaths\t\t:\t" + (mathScore) + "\n" +
                            "\tScience\t\t:\t" + (sciScore) + "\n" +
                            "\tEnglish\t\t:\t" + (engScore) + "\n" +
                            "------------------------------\n" +
                            "\tTotal\t\t:\t" + (total) + "\n" +
                            "-----------------------------\n" +
                            "\tPercentage\t:\t" + (percentage) + "\n" +
                            "\tResult\t\t:\t" + (result) + "\n" +
                            "\tGrade\t\t:\t" + (grade) + "\n" +
                            "------------------------------\n");


                }
            }
        } else {
            System.out.println("Invalid input, Marks should be between 0 to 100");
        }

    }
}