package Concurrency.AssignmentQues;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<List<Integer>> {
    int num;

    public ArrayCreator(int num){
        this.num = num;
    }
    @Override
    public List<Integer> call() throws Exception {
        List<Integer> ansArray = new ArrayList<>();
        for (int i = 1; i <= num ; i++) {
            ansArray.add(i);
        }
        return ansArray;
    }
}
