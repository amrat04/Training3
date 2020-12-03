package com.Training.Basics;

/**
 *  Entity class for chair
 *
 */
public class Chair implements Cloneable{

     public String color;

     protected String size;

     private String legs;

     String comfort;

    public Chair(String clr, String size, String legs, String comfort) {
        this.color = clr;
        this.size = size;
        this.legs = legs;
        this.comfort = comfort;
    }

    public Chair(String color, String size){

        this.color = color;
        this.size = size;
        display(this);

    }
    public Chair(Chair chair){

    }


    public Chair(){
        System.out.println("This is a chair");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(Integer.parseInt(size) >4){
            this.size = size;
        }

    }

    public String getLegs() {
        return legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    public String getComfort() {
        return comfort;
    }

    public void setComfort(String comfort) {
        this.comfort = comfort;
    }

    public String display(Chair chair){


        return "Color is"+color+ " | size is "+size;

    }

    @Override
    public String toString() {

        return "Chair{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", legs='" + legs + '\'' +
                ", comfort='" + comfort + '\'' +
                '}';
    }

}
