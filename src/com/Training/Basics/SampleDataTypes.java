package com.Training.Basics;

public class SampleDataTypes {

    int rollNo;

    char charTest= 'A';

    byte test1= 125;
    short test2 = 234;
    int test3 = 3434;
    long test4 = 343434343;

    float test5 = 23.3f;
    double test6 = 432.33233;

    String test7 = "This is a String";

    boolean isActive = true;

    public void test(){

        boolean isActive;   // Declaration of the variable
        isActive = true;    // Assigning the value

        boolean status = false;

        byte test;
    }

    public int additionOfTwoNumber(int a, int b){
        int c;
        c = a+b;
        return c;
    }
    public void display(){
        System.out.println("This is the display method");
    }

    public static void main(String args[]){

      //  int sum = additionOfTwoNumber(2,3);
      //  System.out.println("sum is "+sum);

        SampleDataTypes s = new SampleDataTypes();
        int sum = s.additionOfTwoNumber(1,2);
        System.out.println("sum is "+sum);
        s.display();

        ConditionalStatements c = new ConditionalStatements();
        c.display();
    }

}
