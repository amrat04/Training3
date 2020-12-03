package com.Training.Polymorphism;

public class MethodOverloadingExample {

    public int add(int i, int j){
        return i+j;
    }

    public String add(String i, int j){
        return i+j;
    }
    public int add(int i, int j, int k){
        return i+j+k;
    }
    public String add(String i, String j){
        return i+" "+j;
    }
    public static void main(String args[]){

        MethodOverloadingExample m = new MethodOverloadingExample();
        System.out.println(m.add(1,2));
        System.out.println(m.add(1,2, 3));
        System.out.println(m.add("hello","world"));

        byte b = 12;
        int in= b;

        int a=20;
        long l = a;

        String str = String.valueOf(a);
        System.out.println("str"+str);
    }
}
