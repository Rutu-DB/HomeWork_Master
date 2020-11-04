package homeworkWeek8.constructOverloading;

public class Students {
    int id;
    String name;
    int age;
    Students (int i, String n){
        id = i;
        name = n;

    }
    Students (int i, String n, int a){
        id = i;
        name = n;
        age = a;

    }
    public void display (){
        System.out.println(id + " " + name + " "+ age);
    }

    public static void main(String args[]){
        Students s1 = new Students(111,"Karan");
        Students s2 = new Students (222, "Aryan", 25);
        s1.display();
        s2.display();
    }


}
