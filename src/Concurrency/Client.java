package Concurrency;

import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        //main thread start
        System.out.println("Main function -> " + Thread.currentThread().getName());
        /*

        for (int i = 1; i <=100 ; i++) {
            PrintNumber printNum = new PrintNumber(i);
            Thread printNumThread = new Thread(printNum);
            //Thread printNumThread = new Thread(new PrintNumber(i));
            printNumThread.start();
        }

         */


        /* During class
        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread threadHWP = new Thread(hwp);

        //Runnable runnableHWP = new HelloWorldPrinter();
        threadHWP.start();
         */

         /* we can also write like this
        Runnable r = new HelloWorldPrinter();
        Thread threadHWPRunnable = new Thread(r);
        threadHWPRunnable.start(); */

        //Class 2
        //fixedThreadPoll
        /*
        ExecutorService es = Executors.newFixedThreadPool(10);
        for (int i = 1; i <=1000 ; i++) {
            es.execute(new PrintNumber(i));
        }
        //CachedThreadPool
        ExecutorService esCached = Executors.newCachedThreadPool();
        for (int i = 1; i <=1000 ; i++) {
            esCached.execute(new PrintNumber(i));

            if(i==300){
                //for debug
                System.out.println();
            }
        }
         */
        //Callable



    }
}
