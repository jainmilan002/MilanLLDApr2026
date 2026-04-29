package Concurrency.MultiThreadSumCalculation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int[] numbers = {5, 7, 10, 15, 20, 27, 25, 30, 40, 50};

        int numThread = Runtime.getRuntime().availableProcessors();
        ExecutorService es = Executors.newFixedThreadPool(numThread);

        List<Future<Long>> results = new ArrayList<>();

        int chunk = numbers.length / numThread;

        for (int i = 0; i < numbers.length; i+= chunk) {
            int start = i;
            int end = Math.min( i + chunk, numbers.length);
            results.add(es.submit(new SumTask(numbers, start, end)));
        }
        long totalSum = 0;
        for (Future<Long> future : results){
            totalSum += future.get();
        }
        System.out.println("Total sum = " + totalSum);

    }
}
