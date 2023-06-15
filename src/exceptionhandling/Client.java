package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
//            int x = scanner.nextInt();
//            int y = scanner.nextInt();
//            System.out.println(x / y);

//            File file = new File("abc.txt");
//            System.out.println("Hello");
//            FileReader reader = new FileReader(file);
            System.out.println("Hey");
            System.out.println("Hi");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = x/y;
            System.out.println("Bye");
        } catch (Exception exception) {
            System.out.println(exception);
            System.out.println("File doesn't exist.");
        } finally {
            System.out.println("Whatever happens, I don't care. I'll always execute");
        }
        System.out.println("Hello");
    }
}
