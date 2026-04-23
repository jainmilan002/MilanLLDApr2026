package Concurrency;

public class Client {
    public static void main(String[] args) {
        //main thread start
        System.out.println("Main function -> " + Thread.currentThread().getName());

        for (int i = 1; i <=100 ; i++) {
            PrintNumber printNum = new PrintNumber(i);
            Thread printNumThread = new Thread(printNum);
            printNumThread.start();
        }


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

    }
}
