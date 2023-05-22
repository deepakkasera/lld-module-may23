package constructors;

public class Client {
    public static void main(String[] args) {
        //Student student = new Student();

        Student student = new Student("Neha", 24, 90.0, "Sept22 Intermediate");

        Student student1 = new Student();

        Student student2 = new Student("Mano", 22);
        student2.batchName = "Sept22 Intermediate";
        student2.psp = 90.80;

        System.out.println("DEBUG");
    }
}
