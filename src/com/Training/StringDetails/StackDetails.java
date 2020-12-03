package com.Training.StringDetails;

import java.util.Stack;

public class StackDetails {

    public static void main(String args[]){

        // Last In First Out (LIFO)
        Stack<Integer> rollNos = new Stack<>();

        rollNos.push(23);
        rollNos.push(34);
        rollNos.push(12);
        rollNos.push(45);

        rollNos.pop();
        System.out.println(rollNos.peek());
        System.out.println(rollNos);
    }
}
