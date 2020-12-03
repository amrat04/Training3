package com.Training.abstraction;

public abstract class StudentService {

    public abstract String getStudents();

    public abstract void saveStudents();

    public void display(){
        System.out.println("This is display users");
    }

    final String userDetails(){
        return "sending all user detsails";
    }
}
