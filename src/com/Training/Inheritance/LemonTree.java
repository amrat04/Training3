package com.Training.Inheritance;

public class LemonTree extends Tree {



    public void getDetails(){
        System.out.println("This is Lemon Tree");
    }
    public static void main(String args[]){
        LemonTree lemonTree = new LemonTree();
        lemonTree.getDetails();
        lemonTree.branches();
    }
}
