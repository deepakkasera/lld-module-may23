package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoOnStreams {
    //Stream is wrapper over a data source (Array, List, Map etc).

    public static void main(String[] args) {
        //Way-1
        Integer[] array = {10, 20, 30, 40, 50, 60};
        Stream<Integer> s1 = Stream.of(array);

        //Way-2
        Stream<Integer> s2 = Stream.of(10, 20, 30, 40);

        //Way-3
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        Stream<Integer> s3 = list.stream();

        /*
        Student student = Student.getBuilder().setName("").setAge().build();
         */

        //Way-4
        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.accept(10);
        streamBuilder.accept(20);
        streamBuilder.accept(30);
        streamBuilder.accept(40);
        Stream<Integer> s4 = streamBuilder.build();

        //Stream<Object> s5 = Stream.builder().add(10).add(20).add(30).build();

    }
}
