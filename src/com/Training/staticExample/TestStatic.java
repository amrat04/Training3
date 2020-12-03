package com.Training.staticExample;

import com.Training.Inheritance.Address;

public class TestStatic {

    static int a=40;
    public static void main(String args[]){
        System.out.println(a);

        Student s = new Student();
        s.setRollNo(101);
        s.setName("Amit");
        Address a = new Address();
        a.setCity("New York");
        a.setStreet1("17 Stree Park Lane");
        s.setAddress(a);

        Student s2 = new Student();
        s2.setRollNo(101);
        s2.setName("Kiran");
        Address a1 = new Address();
        a1.setCity("New York");
        a1.setStreet1("18 Stree Park Lane");
        s2.setAddress(a1);

        Student.StudentWelcomeMessage();

        s.display();
        System.out.println(Student.SCHOOL_NAME);
        Student.change();
        s2.display();

    }
}
