package com.Training.Polymorphism;

public class Dog extends Animal {

    public void eating(){
        System.out.println("dog is eating meat");
    }
    public Dog() {
        super();
        System.out.println("dog is created");
    }
    void display(){
        super.eating();
    }
    public static void main(String args[]){
        Dog d = new Dog();
        d.toString();


    }
}
