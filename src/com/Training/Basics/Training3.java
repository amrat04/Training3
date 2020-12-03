package com.Training.Basics;

import com.Training.Basics.Chair;

public class Training3 {

    public static void main(String args[]){

        Chair c = new Chair();
        c.setColor("Brown");
        c.setComfort("Regular");
        c.setLegs("4 legs");
        c.setSize("long");

        System.out.println("Color of the chair is : "+c.getColor());
        System.out.println("Changing the color of the chair c");
        c.setColor("Red");
        System.out.println("Color of the chair is : "+c.getColor());


        Chair c2 = new Chair();
        c2.setColor("Yellow");
        c2.setSize("Regular");



    }
}
