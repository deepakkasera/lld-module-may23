package accessmodifiers1;

import constructors.Student;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "ABC";

        Student student1 = new Student("Joseph", 24);

    }
}
