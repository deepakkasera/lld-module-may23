package strings;

import oops1.Student;

public class Client {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello");

        String s5 = s1;


        System.out.println((s1 == s2) + " " + s1.equals(s2));
        System.out.println((s2 == s3) + " " + s2.equals(s3));
        System.out.println((s1 == s4) + " " + s1.equals(s4));
        System.out.println((s3 == s4) + " " + s3.equals(s4));
        System.out.println(s1 == s5);


//        System.out.println(System.identityHashCode(s1));
//        System.out.println(System.identityHashCode(s2));
//        System.out.println(System.identityHashCode(s3));

    }
}
