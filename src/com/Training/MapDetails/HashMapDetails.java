package com.Training.MapDetails;

import java.util.HashMap;

public class HashMapDetails {

    public static void main(String args[]){
        HashMap<Book,Integer> bookMap = new HashMap<>();
        Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(233,"Operating System","Galvin","Wiley",6);
        Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);

        // Hashmap stores 4
        bookMap.put(b1,1);
        System.out.println("HashCode of book :"+b1.hashCode()+" & map:"+bookMap.hashCode());
        bookMap.put(b2,2);
        System.out.println("HashCode of book :"+b2.hashCode()+" & map:"+bookMap.hashCode());
        bookMap.put(b3,3);
        System.out.println("HashCode of book :"+b3.hashCode()+" & map:"+bookMap.hashCode());



    }
}
