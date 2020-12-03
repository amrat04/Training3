package com.Training.Polymorphism;

public class Car {

    final int speed=100;
    public void speed(){
        System.out.println("Car runs at average speed of 100  miles/hour");
    }
    public void hasBreak(){
        System.out.println("General Car has regular breaks");
    }
    public void hasEngine(){
        System.out.println("General Car has regular Engine");
    }
    public static void welcomeCar(){
        System.out.println("Welcome to the CAR SHOP");
    }
}
