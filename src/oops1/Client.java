package oops1;

public class Client {
    public static void main(String[] args) {
        //int a = 10;
        //new keyword -> allocates new space in the memory
        //Student() -> constructor.
        Student harsh = new Student();

        //harsh will have default values.
        // String->NULL
        // int -> 0
        // double -> 0.0

        harsh.name = "Harsh";
        harsh.age = 22;
        harsh.psp = 90.0;
        harsh.batchName = "Sept22 Intermediate";

        System.out.println("DEBUG");
    }
}
