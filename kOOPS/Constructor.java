class Student {
    String name;
    int age;

    // non-parameterized constructor
    // Student() {
    // System.out.println("constructor called");
    // }

    // parameterized constructor
    Student(String Name, int Age) {
        this.name = Name;
        this.age = Age;
    }

    public void sInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        // for non-parameterized constructor
        // Student s1 = new Student();
        // s1.name = "nikk";

        // for parameterized constructor
        Student s1 = new Student("nikk", 21);
        s1.sInfo();
    }

}
