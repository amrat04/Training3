package com.Training.exceptionHandling;

public class SimpleExceptions {

    static int age=15;
    public static void main(String args[]) throws Exception,NullPointerException{

        System.out.println("This is the test in begining");
        try {
            //int test = age/0;
            System.out.println("age"+age);
            if(age<18){
                throw new InvalidAgeException("Invalid age . Age is less than 18");

            } else {
                throw new NullPointerException("you cannot vote");
            }

        } catch (ArithmeticException e) {
            try{
                int age1=12/0;
            } finally {
                System.out.println("nested finally");
            }
            System.out.println("Arithmetic Exception has occured");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Nullpointer Exception has occured");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception has occured. ");
            e.printStackTrace();
        } finally {
            System.out.println("This will get executed in both the  condition");
        }
        System.out.println("This is the test in end");
        System.out.println("This is the test in end");
        System.out.println("This is the test in end");

        System.gc();
    }
    public void finalize(){

        age=0;
        // assigning all unused object s to null
        System.out.println("Finalize will be called");
    }
}
