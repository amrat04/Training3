package com.Training.ThreadExamples;

public class MyThread3 extends Thread{
    public void run(){
        StaticSynchExample.printTable(100);
    }
}
