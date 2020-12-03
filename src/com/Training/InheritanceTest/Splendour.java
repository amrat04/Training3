package com.Training.InheritanceTest;

public class Splendour extends Bike {

    void display(){
        System.out.println("Has regular display");
    }
    public static void main(){
        Splendour s = new Splendour();
        int speed = s.speed;
        s.display();
        s.hasEngine();

        Bike b = new Bike();

    }
}
