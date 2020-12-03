package com.Training.ThreadExamples;

import java.io.IOException;

public class SimpleThreads extends Thread {

    static String abcd = "";


    public void run() {
        try {
            for (int i = 1; i < 10; i++) {

                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() +"--" + i);

                if(i==6){
                    System.exit(0);

                }
            }

        } catch (Exception e) {

        }
    }

    public static void main(String args[]) throws IOException {
        SimpleThreads t = new SimpleThreads();
        //abcd = args[0];
        //t.setPriority(10);// from 1 to 10 - 1 - minum | 10-maximum | bydefault is 5
        int i = t.getPriority();
        System.out.println("getPriority" + i);

        SimpleThreads t2 = new SimpleThreads();


        t.start();
        t2.start();
        t.setName("test1");
        System.out.println("Thread1 name : "+t.getName() +"id is"+t.getId());
        System.out.println("Thread2 name : "+t2.getName()+" id is "+t2.getId());

        t.setPriority(Thread.MIN_PRIORITY);

        SimpleThreads runnable = new SimpleThreads();
        ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");

        Thread t11 = new Thread(tg1, runnable,"one");
        t11.start();
        Thread t33 = new Thread(tg1, runnable,"three");
        t33.start();

        t11.stop();
        t11.resume();
        tg1.stop();

        Runtime.getRuntime().exec("notepad.exe");

        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
