package com.Training.ThreadExamples;

public class InturruptedThreadExample extends Thread {

    public void run() {
        for (int i = 1; i <= 50; i++) {
            if (Thread.interrupted()) {
                System.out.println("code for interrupted thread");
            } else {
                System.out.println("code for normal thread");
            }

        }
    }

    public static void main(String args[]){

        InturruptedThreadExample t1=new InturruptedThreadExample();
        InturruptedThreadExample t2=new InturruptedThreadExample();

        t1.start();
        t1.interrupt();

        //t2.start();

    }
}



