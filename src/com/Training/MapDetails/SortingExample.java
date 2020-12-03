package com.Training.MapDetails;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExample {

    public static void main(String args[]){

        List<Book> books = new ArrayList<>();

        Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(233,"Operating System","Galvin","Wiley",6);
        Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);

        books.add(b1);
        books.add(b2);
        books.add(b3);

        Collections.sort(books);


        for (Book s : books) {
            System.out.println(s.getName());
        }
    }
}
