package com.Training.Inhertance2;

class Circle {
    Operation op;//aggregation

    double pi = 3.14;

    double area(int radius) {
        op = new Operation();
        int rsquare = op.square(radius);//code reusability (i.e. delegates the method call).
        return pi * rsquare;
    }

    public static void main(String args[]){
        Circle c = new Circle();
        // Area of circle = pie * r2
        double areaOfCirlce = c.area(3);
        System.out.println("Area of circle"+areaOfCirlce);
    }
}
