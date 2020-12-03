package com.Training.StringDetails;

public class StringFunctionality {

    public static void main(String args[]){

        String test="Java";
        if(test.equalsIgnoreCase("java")){
            System.out.println("Both strings are equals");
        } else {
            System.out.println("Not equal");
        }

        test = test.concat(" is good");
        System.out.println("2nd index : "+test.charAt(8));

        char[] ch = new char[10];
        test.getChars(5,7, ch,0);

        System.out.println(ch);
        System.out.println(test.length());

        System.out.println("av is part of string : "+test.contains("z"));

        String test1 = "This is testing";
        System.out.println(test1.replace("is","in"));

        String[] strArr = test1.split(" ",5);
        for(int i = 0;i < strArr.length;i++){
            System.out.println(strArr[i]);
        }

        String test2 = "testing";
        char[] chars = test2.toCharArray();
        for(char c : chars){
            System.out.println(c);
        }
        int age = 18;
        if(age ==18){

        }
        String ageStr = String.valueOf(age);
        test2.concat(String.valueOf(age));
        boolean isactive = true;
        test2.concat(String.valueOf(isactive));

        System.out.println("test2 "+test2);
        String charStr = String.valueOf('A');
      //display("");
    }
    static void display(String age){

        if(age.isEmpty()){
            // throw some error.
            age="18";
        }
        System.out.println(age);
    }
}
