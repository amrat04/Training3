package com.Training.Inheritance;


public class InheritanceTest {

    public static void main(String args[]){

        Tree tree = new Tree();
        tree.branches();

        // Inheritance
        MangoTree mangoTree = new MangoTree();
        mangoTree.getTreeDetails();
        mangoTree.branches();

        LemonTree lemonTree = new LemonTree();
        lemonTree.getDetails();
        lemonTree.branches();

        // Inheritance has a relationship test
        Student student = new Student();

        student.setRollNo(101);
        student.setName("Ravi");
        student.setDivision("A");

        Address address = new Address();
        address.setStreet1("17 Park's lay");
        address.setStreet2("Near ABC");
        address.setCity("CALIFORNIA");

        student.setAddress(address);

        System.out.println("Name of the student1 : "+student.getName());
        System.out.println("City of student1 : "+student.getAddress().getCity());

        Address a = new Address("s1","s2","NY");

        Student student2 = new Student(102, "ABC", a, "B");

        System.out.println("Name of student2 "+student2.getName());

        Student student3 = new Student(103, "XYZ");

        System.out.println("Roll of student3 "+student3.getRollNo());
        System.out.println("Name of student3 "+student3.getName());

    }
}
