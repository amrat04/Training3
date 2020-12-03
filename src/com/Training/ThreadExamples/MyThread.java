package com.Training.ThreadExamples;

public class MyThread extends Thread{
    public void run(){
        StaticSynchExample.printTable(1);
    }
}
