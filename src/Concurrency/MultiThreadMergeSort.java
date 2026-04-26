package Concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class MultiThreadMergeSort implements Callable<List<Integer>> {
    List<Integer> arrToSort;

    public MultiThreadMergeSort(List<Integer> arr){
        this.arrToSort = arr;
    }

    @Override
    public List<Integer> call() throws Exception {
        //base condition
        if(arrToSort.size() == 1){
            return arrToSort;
        }
        int size = arrToSort.size();
        int mid = size/2;

        List<Integer> leftArrayToSort = new ArrayList<>();
        List<Integer> rightArrayToSort = new ArrayList<>();

        return List.of();
    }
}
