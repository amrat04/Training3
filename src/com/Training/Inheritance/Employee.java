package com.Training.Inheritance;

import java.io.Serializable;

public class Employee implements Serializable, Cloneable {

    int empId;

    String name;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  static void main(String args[]) throws CloneNotSupportedException {
        Employee e = new Employee();
        e.setEmpId(101);
        e.setName("John");


        System.out.println(e.toString());


    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                '}';
    }
}
