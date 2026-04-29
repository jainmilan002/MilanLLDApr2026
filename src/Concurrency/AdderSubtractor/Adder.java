package Concurrency.AdderSubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

public class Adder implements Callable<Void> {
    SharedVal sVal;
    ReentrantLock lock;

    public Adder(SharedVal i, ReentrantLock lock) {
        this.sVal = i;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for (int j = 1; j <= 100 ; j++) {
            lock.lock();
            sVal.i += 1;
            lock.unlock();
        }
        return null;
    }
}
