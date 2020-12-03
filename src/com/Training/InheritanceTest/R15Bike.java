package com.Training.InheritanceTest;

public class R15Bike extends Bike {

    void display(){
        System.out.println("Has fancy look ");
    }

    public static void main(String args[]){
        R15Bike r15Bike = new R15Bike();
        int speed = r15Bike.speed;
        r15Bike.display();
        r15Bike.hasEngine();

    }
}
