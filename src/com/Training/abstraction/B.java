package com.Training.abstraction;

import com.Training.Basics.Car;
import com.Training.Basics.Chair;


public class B extends Chair {

    public void display(){
        System.out.println("this is display");
        EmployeeService employeeService = new EmployeeSericeImpl();

        EmployeeService employeeService1 = new EmployeeServiceMockImpl();

    }


    public static void main(String args[]){
        EmployeeService employeeService = new EmployeeSericeImpl();

        EmployeeService employeeService1 = new EmployeeServiceMockImpl();

        B b = new B();

    }
}
