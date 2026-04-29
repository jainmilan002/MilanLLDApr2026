package Concurrency.AdderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        SharedVal sVal = new SharedVal();

        ReentrantLock lock = new ReentrantLock();

        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Void> adder = es.submit(new Adder(sVal, lock));
        Future<Void> subtractor = es.submit(new Subtractor(sVal, lock));

        adder.get();
        subtractor.get();
        System.out.println(sVal.i);

    }
}
