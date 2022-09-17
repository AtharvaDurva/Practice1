package javaPractice;

public class Student {
    // this class is to understand the object with group
    String Name;
    int id;
    int age;


    public static void main(String[] args) {
        Student s = new Student();
        s.Name = "margi";
        s.id = 5;
        s.age = 31;

        System.out.println(s.Name + "=" + s.id);
        System.out.println(s.age);


    }
}
