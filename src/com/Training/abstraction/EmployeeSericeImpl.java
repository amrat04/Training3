package com.Training.abstraction;

public class EmployeeSericeImpl implements EmployeeService {


    public void testMethod(){
        System.out.println("This is test method");
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
    public static void main(String args[]){
        EmployeeSericeImpl e = new EmployeeSericeImpl();
        System.out.println(e.noOfStudents);



    }
}
