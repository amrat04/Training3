package com.Training.Basics;

public class Student {

    int rollNo;

    String name;

    String street1;

    String Street2;

    String City;

    static String collageName;
    static boolean isActive;

    static {
        collageName = "ITC";
        isActive = false;
        System.out.println("This is Student static block ");
    }
    public Student(){

        System.out.println("New Object is created"+collageName);
    }
    static void change(){
        collageName = "ABC";
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

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return Street2;
    }

    public void setStreet2(String street2) {
        Street2 = street2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    void display(){
        System.out.println("Name "+name +"  city"+City + " collage name "+collageName);
    }
}
