package lambdas;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        //Way 1 of using interfaces.
        Predicate<Integer> predicate = new PredicateImpl();
        //System.out.println(predicate.test(200));

        //Way 2 : Using anonymous class.
        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer > 100) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        //System.out.println(predicate1.test(50));

        //Way3 : Lambda -> Lambda is a way to provide the implementation of
        // a functional interface.
        Predicate<Integer> predicate2 = (x) -> {
            if (x > 100) return true;
            else return false;
        };
        //System.out.println(predicate2.test(50));

        Predicate<Integer> predicate3 = val -> val > 100;
        //System.out.println(predicate3.test(50));

        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + " " + str2;
        System.out.println(binaryOperator.apply("Hello", "World"));

        BiFunction<Integer, String, String> biFunction = (val, str) -> {
            if (str.length() > val) {
                return "String length is greater than val.";
            } else {
                return "String length is less than val.";
            }
        };
        System.out.println(biFunction.apply(5, "hi"));
    }
}
