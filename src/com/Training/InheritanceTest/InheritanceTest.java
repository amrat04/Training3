package com.Training.InheritanceTest;

public class InheritanceTest {

    public static void main(String args[]){

        Employee e = new Employee();
        e.setName("John");
        e.setEmployeeId(101);

        Address address = new Address();
        address.setStreet1("40 Mark street");
        address.setStreet2("near Oks Lane");
        address.setStreet3("test");
        address.setCity("California");

        e.setAddress(address);

        System.out.println("Emp id "+e.getEmployeeId());
        System.out.println("Name "+e.getName());
        System.out.println("Street1 of employee "+e.getAddress().toString());



    }
}
