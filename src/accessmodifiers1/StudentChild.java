package accessmodifiers1;

import accessmodifiers.Student;

public class StudentChild extends Student  {
    public static void main(String[] args) {
        StudentChild sc = new StudentChild();
        sc.batchId = 432;
        //Protected data member can be accessed within the child class outside the package
        // via the object of child class.

//        Student student = new Student();
//        student.batchId =
    }
}
