package com.Training;

public class Synchronize {

    static {

    }
    public synchronized void testMethod(){
        System.out.println("TEST");
        System.out.println("TEST");
        System.out.println("TEST");
        System.out.println("TEST");

        synchronized(this) {
            System.out.println("TEST");
            System.out.println("TEST");
        }
        System.out.println("TEST");
        System.out.println("TEST");
        System.out.println("TEST");
        System.out.println("TEST");


    }
}
