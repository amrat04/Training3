package com.Training.ThreadExamples;

public class ThreadWithRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable thread is running ");
    }

    public static void main(String args[]){
        /*ThreadWithRunnable runnableThread = new ThreadWithRunnable();
        Thread thread = new Thread(runnableThread);

        thread.start();*/

            MyThread t1=new MyThread();
            MyThread2 t2=new MyThread2();
            MyThread3 t3=new MyThread3();
            MyThread4 t4=new MyThread4();
            t1.start();
            t2.start();
            t3.start();
            t4.start();

        }
}
