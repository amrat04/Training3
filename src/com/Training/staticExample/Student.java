package com.Training.staticExample;

import com.Training.Inheritance.Address;

public class Student {

    int rollNo;

    String name;

    Address address;

    public static String SCHOOL_NAME = "Stafforshire";

    static{
        System.out.println("This will be called even before any object is created at the time of class loading.");
    }
    static void StudentWelcomeMessage(){
        System.out.println("Welcome to the School");
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    static void change(){
        SCHOOL_NAME = "APIIT";
    }
    void display(){
        System.out.println(rollNo+" "+name+" "+SCHOOL_NAME);
    }
}
