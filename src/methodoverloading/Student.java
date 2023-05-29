package methodoverloading;

public class Student {
    String name;
    int age;

    //name -> hello
    //signature -> hello(String)
    void hello(String name) {
        System.out.println("hello String");
    }

    //name -> hello
    //signature -> hello()
    void hello(Object s) {
        System.out.println("hello Object");
    }

    //name -> hello
    //signature -> hello(String)
//    String hello(String name) {
//        System.out.println("hello " + name);
//    }
}

// 10:39 PM
