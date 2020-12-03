package com.Training.Polymorphism;

public class Mercedez extends Car {

    int speed =200;
    public void speed(){
        System.out.println("speed is :"+speed);
        System.out.println("Mercedez runs at average speed of"+speed+ " miles/hour. " +
                "Regular speed is "+super.speed+"  miles/hour");
    }

    public static void main(String args[]){
        byte b = 2;
        short s= b;
        int a =s;
        long l =a;
        Car carO = new Mercedez();
        carO.speed();


        Car.welcomeCar();

        String c = String.valueOf(a);//"230"


        Mercedez m = new Mercedez();
        m.speed();
        m.hasBreak();
        m.hasEngine();
        System.out.println(m.speed);




        Maruti maruti = new Maruti();
        maruti.speed();
        maruti.hasBreak();
        maruti.hasEngine();

        Car car = new Car();
        car.speed();
        car.hasBreak();
        car.hasEngine();
    }
}
