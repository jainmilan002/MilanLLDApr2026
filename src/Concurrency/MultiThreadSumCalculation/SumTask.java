package Concurrency.MultiThreadSumCalculation;

import java.util.concurrent.Callable;

public class SumTask implements Callable<Long> {
    private final int[] arr;
    private final int start;
    private final int end;

    public SumTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }


    @Override
    public Long call() throws Exception {
        long sum = 0;
        for(int i = start; i < end; i++){
            sum += arr[i];
        }
        return sum;
    }
}
