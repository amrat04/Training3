package com.Training.abstraction;

import com.Training.Basics.Chair;

import java.io.Serializable;
import java.util.stream.Collectors;

public class TestingClass implements EmployeeService, CollageService, Serializable {


    Chair c;

    public void testmethod(){
        c = new Chair();
    }
    public static void main(String args[]){

        StudentServiceDetails studentServiceDetails = new StudentServiceDetails();
        studentServiceDetails.display();
        studentServiceDetails.getStudents();
        studentServiceDetails.saveStudents();


        StudentService s = new StudentService() {
            @Override
            public String getStudents() {
                return null;
            }

            @Override
            public void saveStudents() {

            }
        };


    }

    @Override
    public String getEmployee() {
        return null;
    }

    @Override
    public void saveEmployee() {

    }

    @Override
    public void updateEmployee() {

    }

    @Override
    public String deleteEmployee() {
        return null;
    }

    @Override
    public void display() {

    }

    @Override
    public void getCollageDetails() {

    }
}
