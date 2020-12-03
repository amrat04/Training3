package com.Training.abstraction;



public class StudentServiceDetails extends StudentService {

    @Override
    public String getStudents() {
        System.out.println("getting details from db");
        return "getAll students";
    }

    @Override
    public void saveStudents() {
        System.out.println("saving details from db");
    }

}
