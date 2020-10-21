package total20Programmes;
/*This is a beigining of class which calls 4 variables (2 instance and 2 static) from
* a static and instance method */
public class Answer4 {
    int age1 = 30; // instance variable 1
    static int age2 = 50; // static variable 1
    String name1 = "Mr. Smith"; // instance variable 2
    static String name2 = "Mr. John"; // static variable 2

    // Main method begins
    public static void main(String[] args) {
     static1(); // calling static variable in main method
     Answer4 callInstMethod = new Answer4(); // object created
     callInstMethod.instance1(); // calling instance into Main method
    }
    // Instance method begins - called all four variables
    public void instance1 (){
        System.out.println("Instance Method Prints : " + name1 + "'s age is " + age1 + " and " + name2 + "'s age is "+ age2);

    }
    // Static method begins - called all four variables
  public static void static1 () {
        Answer4 staticVar = new Answer4(); // obj created to call instance variables
      System.out.println("Static Method Prints : " + staticVar.name1 + "'s age is " + staticVar.age1 + " and " + name2 + "'s age is " + age2);
  }
}
