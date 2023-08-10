package lambdas;

import java.util.function.Predicate;

public class PredicateImpl implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        if (integer > 100) {
            return true;
        } else {
            return false;
        }
    }
}
