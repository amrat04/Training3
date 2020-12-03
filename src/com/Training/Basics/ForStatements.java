package com.Training.Basics;

public class ForStatements {

    public static void main(String args[]){


        for(int i=0 ; i <= 5 ; ){
            System.out.println("Value of i ="+i);
            i++;
        }
        System.out.println("out of the for loop");
        //i++ : i = i+1;
        //i-- : i = i-1;
        //for( declaration ; condition ; incremental/decremental)



        for(int i=1; i<=3; i++){
            //loop of j
            for(int j=1; j<=3 ; j++){
                System.out.println(i+" "+j);
            }//end of i
        }//end of j


        for(int i=1; i<=5 ; i++){
            for(int j=1; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();//new line
        }

        for(int i=1;i>=1;i++){
            System.out.println("infinitive loop");
        }

    }

}
