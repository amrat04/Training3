package com.Training.Basics;

public class WhileStatements {

    public static void main(String args[]){

        // while loop
        int i=1;
        while(i<=10){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }

        // do-while
        int j=10;
        do{
            System.out.println(j);
            j++;
        } while (j<10);

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}
