package com.Training.Inheritance;

public class Address implements Comparable<Address> {

    public String street1;

    public String street2;

    public String city;

    public Address(){
        System.out.println("Address is created");
    }

    public Address(String street1, String street2, String city) {

        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public int compareTo(Address o) {
        return city.compareTo(o.city);
    }

}
