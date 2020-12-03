package com.Training.Basics;

public class StaticSample {

    String abcd = Student.collageName;

    public static void main(String args[]){


        Student s1 = new Student();
        s1.setName("John");
        s1.setRollNo(101);
        s1.setCity("California");

        Student s2 = new Student();
        s2.setName("Ravi");
        s2.setRollNo(102);
        s2.setCity("California");

        s1.display();
        s2.display();

        Student.change();

        Student s3 = new Student();
        s3.setName("str3");
        s3.setRollNo(103);
        s3.setCity("California");

        Student s4 = new Student();
        s4.setName("str4");
        s4.setRollNo(104);
        s4.setCity("California");

        s3.display();
        s4.display();
        int max = Math.max(2,3);
    }
}
