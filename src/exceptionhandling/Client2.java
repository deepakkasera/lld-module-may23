package exceptionhandling;

import java.io.File;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = a/b;
            System.out.println(c);

            File file = new File("abc.txt");
            FileReader fileReader = new FileReader(file);

        } catch (NullPointerException exception) {
            System.out.println("NPE");
        } catch (InputMismatchException exception) {
            System.out.println("InputMismatchException");
        } catch (ArithmeticException exception) {
            System.out.println("ArithmeticException");
        } catch (Exception exception) {
            //System.out.println(exception.toString());
            System.out.println("General Exception");
        } finally {
            System.out.println("Finally this will execute");
        }
    }
}
