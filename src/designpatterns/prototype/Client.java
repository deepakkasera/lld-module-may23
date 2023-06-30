package designpatterns.prototype;

public class Client {

    public static void fillRegistry(StudentRegistry registry) {
        Student sept22Prototype = new Student();
        sept22Prototype.setBatchName("Sept22");
        sept22Prototype.setAvgBatchPsp(85.0);

        registry.register("Sept22", sept22Prototype);

        IntellijStudent sept22IntellijStudentPrototype = new IntellijStudent();
        sept22IntellijStudentPrototype.setBatchName("Sept22");
        sept22IntellijStudentPrototype.setAvgBatchPsp(85.0);
        registry.register("Sept22Intellijent", sept22IntellijStudentPrototype);
    }
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

        Student vipul = registry.get("Sept22").clone();
        vipul.setName("Vipul");
        vipul.setAge(25);
        vipul.setPsp(99);

        Student bijit = registry.get("Sept22").clone();
        bijit.setName("Bijit");
        bijit.setAge(26);
        bijit.setPsp(95);

        Student shuhail = registry.get("Sept22Intellijent").clone();
        shuhail.setName("Shuhail");
        shuhail.setAge(26);
        shuhail.setPsp(90);

        System.out.println("DEBUG");
    }
}
