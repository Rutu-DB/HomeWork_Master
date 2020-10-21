package total20Programmes;

// This class prints Name using Static Methods
public class Answer2 {
    static String title = "Mr. "; // Static Variable declared in Class
    static String surName = "John"; // Static Variable declared in Class

    public static void main(String[] args) {
        printName();
    }
    // static method created

    public static void printName() {
        System.out.println("Hello! " + title + surName);
    }
}
