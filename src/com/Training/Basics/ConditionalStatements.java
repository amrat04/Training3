package com.Training.Basics;

public class ConditionalStatements {

    int rollNo=23;

    public void display(){
        if(rollNo > 18){
            System.out.println("can vote");
        } else {
            System.out.println("can't vote");
        }

        String response = (rollNo > 18) ? "can vote " : "can't vote";  //ternary operator
        System.out.println(response);

    }
    public static void main(String args[]){
        int age = 70;

        // if Conditions
        if(age>=18 && age<=35){
            System.out.println("You are young. You can vote");
        } else if(age>36 && age <55){
            System.out.println("you can still vote");
        } else {
            System.out.println("You are not eligible to vote till 18 years");
        }

        if(age > 18){
            System.out.println("can vote");
        } else {
            System.out.println("can't vote");
        }

        String response = (age > 18) ? "can vote " : "can't vote";  //ternary operator
        System.out.println(response);

        // Nesting.
        int weight = 40;
        //applying condition on age and weight
        if(age>=18){
            if(weight>50){
                System.out.println("You are eligible to donate blood");
            } else {
                System.out.println("Age is fine. But weight is less");
            }
        } else {
            System.out.println("Too young to give the blood");
        }

        Chair c = new Chair("","");



    }
}
