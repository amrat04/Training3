package com.Training.Polymorphism;

public class TestMethodOverloading {

    public int add(int a, int b){
        int sum = a+b;
        return sum;
    }

    public int add(int a, int b,int c){
        int sum = a+b+c;
        return sum;
    }

    public String add(String a, String b) {
        String sum = a+" "+b;
        return sum;
    }
    // Example of method overloading
    public static void main(String args[]){
        TestMethodOverloading t = new TestMethodOverloading();

        System.out.println("2 int params : "+t.add(1,2));
        System.out.println("3 int params : "+t.add(1,2,3));
        System.out.println("2 String params : "+t.add("hello","world"));
    }
}
