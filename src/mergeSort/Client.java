package mergeSort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> arrayToSort = List.of(4,3,2,7,6,1,5,8);
        ExecutorService executor = Executors.newCachedThreadPool();
        MergeSorter mergeSorter = new MergeSorter(arrayToSort, executor);

        //List<Integer> sortedArray = mergeSorter.call();
        Future<List<Integer>> sortedArrayFuture = executor.submit(mergeSorter);

        List<Integer> sortedArray = sortedArrayFuture.get();
        System.out.println(sortedArray);

        executor.shutdown();
    }
}
