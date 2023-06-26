package strings;

public class Main {
    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println(s1); ///hello

        s1.replace('l', 'x');
        System.out.println(s1); //hello

        String s2 = s1.replace('l', 'x');
        System.out.println(s1); // hello
        System.out.println(s2); // hexxo

        s1 = s1.replace('l', 'x');
        System.out.println(s1); // hexxo

        // s1 = s1.replace('l', 'l');

    }
}
