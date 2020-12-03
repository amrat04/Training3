package com.Training.Basics;

public class Training7 {

    static String testString;

    static void calculate(){
        testString = "hello world";
    }
    public static void main(String args[]){

        Training7.calculate();

        Training7 t7 = new Training7();

        System.out.println("Value of "+testString);
    }
}
