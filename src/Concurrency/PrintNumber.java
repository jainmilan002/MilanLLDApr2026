package Concurrency;

public class PrintNumber implements Runnable {
    int num;

    PrintNumber(int num){
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Print number: " + this.num + " on thread " + Thread.currentThread().getName());
    }
}
