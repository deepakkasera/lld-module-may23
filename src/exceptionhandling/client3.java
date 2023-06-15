package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class client3 {
    public static void main(String[] args) throws ArithmeticException {
        File file = new File("abc.txt");
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int c = 0;

        if (y != 0) {
            c = x/y;
        }
        System.out.println(c);

    }
}
