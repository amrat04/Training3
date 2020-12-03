package com.Training.Basics;

public class Test {
    public static void main(String args[]){

        System.out.println(Car.CAR_BRAND);

        /*Car c = new Car();
        c.setEngine("test");
        c.display();*/


        Chair chair = new Chair();


        chair.setColor("Red");
        chair.setLegs("4");
        chair.setSize("Medium");
        chair.setComfort("Very Comfortable");

        System.out.println("Comfort of the chair is : " + chair.getComfort());

        Chair chair1 = new Chair("Brown","Long","4","Easy to use");

        Chair chair2 = new Chair("Brown","Long");


    }
}
