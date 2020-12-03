package com.Training.Inheritance;

public class Student {

    private int rollNo;

    private String name;

    private Address address;    // has-a relationship

    private String division;

    public Student() {
    }

    public Student(int r, String n, Address address, String division) {
        this.rollNo = r;
        this.name = n;
        this.address = address;
        this.division = division;
    }
    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
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

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

}
