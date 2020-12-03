package com.Training.ThreadExamples;

public class MyThread4 extends Thread{
    public void run(){
        StaticSynchExample.printTable(1000);
    }
}
