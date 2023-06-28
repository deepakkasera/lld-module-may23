package designpatterns.builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = Builder.getBuilder();
//        builder.setName("Deepak");
//        builder.setAge(27);
//        builder.setPsp(90.0);
//        builder.setGradYear(2021);

        Student student = Student.getBuilder()
                            .setName("Girbaan")
                            .setAge(25)
                            .setPsp(90.0)
                            .setGradYear(2020).build();

        //Student student1 = new Student();
        //Student.Builder builder = new Student.Builder();
        //Student st = new Student(builder1);
        //Student st1 = new Student(null);

        System.out.println("DEBUG");
    }
}
