package homeworkWeek3RB;

// This program prints details about person
public class Person {
    private String firstName, lastName;
    private int age;

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("FullName = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen());
        person.setFirstName("John ");
        person.setAge(18);
        System.out.println("FullName =" + person.getFullName());
        System.out.println("Teen = " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("FullName = " + person.getFullName());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lName) {
        this.lastName = lName;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int newAge) {
        if (newAge < 0 || newAge > 100) {
            this.age = 0;
        }
        this.age = newAge;
        return newAge;
    }
    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        String fullName = firstName + lastName;
        return fullName;
    }

}
