package com.Training.Basics;
/**
 *  This is the training session class for Loops.
 */
public class Loops {

    /**
     * This is the main class from where execution will start.
     * @param args : are input parameters
     */
    public static void main(String args[]){

        //  Example of for loop
        for(int i = 1; i < 10 ; i++){
            System.out.println("value of i : " + i);
        }

        for(int i = 10; i >= 0 ; i--){
            System.out.println("value of i with decremental  : " + i);
        }

        for(int i=1;i<=3;i++){  // List of students

            //loop of j
            for(int j=1;j<=3;j++){  // list of address of students.
                System.out.println(i+" "+j);

            }//end of j

        }//end of i

        for(int i=1;i<=8;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();//new line
        }


    //  i++
        //  i = i+1;

        // while
        int j = 0;

        while(j<10){
            System.out.println(" value of J : "+ j);
            j++;
        }

        // doWhile
        int k=10;
        do{
            System.out.println(" value of k : "+ k);
            k++;
        }while (k<5);

        //  Example of break

        //using for loop
        for(int i=1;i<=10;i++){

            if(i == 5){
                // the loop
                continue;
            }
            System.out.println("example of break : I : "+i);
            //  statement2
            //  statement2
            //  statement2

        }
        int age=0;
        while(true){

            if (age == 10) {
                break;
            }
            System.out.println("Age is "+age);
            age=age+1;
        }
        System.out.println("outside and printing the rest");


        // This is a single line comment

        /*int somevariable=0;
        if(somevariable==0){
            System.out.println("This is for testing");
        }*/

    }
}
