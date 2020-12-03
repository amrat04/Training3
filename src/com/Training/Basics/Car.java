package com.Training.Basics;

public class Car {

    String breakType;

    String speed;

    String engine;

    String color;

    public static String CAR_BRAND = "MERZ";

    public String getBreakType() {
        return breakType;
    }

    public void setBreakType(String breakType) {
        this.breakType = breakType;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void display(){
        System.out.println("This is the car with display method");
    }
    private static void testMethod(){
        System.out.println("This is a test method");
    }
    public int add(int i,int j){
        int sum = i + j;
        return sum;
    }
    public String add(String i, String j){
        System.out.println("geting the variable");
        return i+j;
    }
    public static void main(String args[]){

        Car car = new Car();
        car.setColor("red");
        car.setBreakType("Regular");
        car.setEngine("Heavy");
        car.setSpeed("100");
        car.display();

        int t1 = Integer.parseInt(args[0]);

        int i2 = Integer.parseInt(args[1]);
        System.out.println(t1 +" and "+i2);
        int result = car.add(t1,i2);
        System.out.println("Result is "+result);

        System.out.println(car.add("hello","world"));
        display();

        testMethod();

        int test;      // Declaration
        test = 10;      // Initialization

        int test1=10;
        System.out.println("test"+CAR_BRAND);
 
                System.out.println("test");


    }
}
