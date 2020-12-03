package com.Training.ThreadExamples;

public class MyThread2 extends Thread{
    public void run(){
        StaticSynchExample.printTable(10);
    }
}
