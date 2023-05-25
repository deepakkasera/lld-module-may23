package constructors;

public class Student {
    public String name;
    int age;
    double psp;
    String batchName;

    public Student(String stName, int age, double psp, String batch)  {
        name = stName;
        this.age = age;
        this.psp = psp;
        this.batchName = batch;
    }
    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.psp = student.psp;
        this.batchName = student.batchName;
    }
}
