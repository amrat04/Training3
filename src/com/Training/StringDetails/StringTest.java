package com.Training.StringDetails;

import com.Training.Inheritance.Employee;
import com.Training.MapDetails.Book;

import java.util.*;

public class StringTest {

    public static void main(String args[]){
        String a = "Sachin";
        a = "Sehwag";

        if(a == "test"){
System.out.println("value is"+a);
        a.concat("test");

        }
        int b=10;
        if(b==10){

        }
        String test="abcd";
        StringBuffer sb = new StringBuffer();
        String[] strings = {"1","2","3"};
        for(String s : strings){
            sb.append(s);
        }

        System.out.println("sb:"+sb);

        ImmutableClassExample i = new ImmutableClassExample("ANRPC232");
        i.getPancardNumber();

        Employee e = new Employee();
        e.setName("abc");

        Employee e1 = new Employee();
        e1.setName("abc");

        if(e.equals(e1)){
            
        }

        ArrayList<String> studentsName = new ArrayList<>();
        studentsName.add("John");
        studentsName.add("Ravi");
        studentsName.add("John");
        studentsName.add("Amit");
        studentsName.add("abc");
        studentsName.add("xyz");
        System.out.println("Size of studentsname List is : "+ studentsName.size());
        System.out.println("first index value "+studentsName.get(1));
        System.out.println("Is John present in list : "+studentsName.contains("John"));
        System.out.println("Is John present in list : "+studentsName.contains("Amit"));

        for(int j=0; j<studentsName.size();j++){
            System.out.println("student : "+studentsName.get(j)+" on index"+j);
        }
        studentsName.remove("Ravi");
        studentsName.remove(1);
        //studentsName.set(1,"Akshay");
        studentsName.add(1,"Akshay");
        System.out.println("Size of studnetsName is :"+studentsName.size());
        for(int j=0; j<studentsName.size();j++){
            System.out.println("student : "+studentsName.get(j)+" on index"+j);
        }

        ListIterator<String> list1=studentsName.listIterator(studentsName.size());
        while(list1.hasNext())
        {
            String str=list1.next();
            System.out.println(str);
        }

        Iterator<String> list2=studentsName.iterator();
        while(list2.hasNext())
        {
            String str=list2.next();
            System.out.println(str);
        }

        LinkedList<String> carsNames = new LinkedList<>();
        carsNames.add("Mercedez");
        carsNames.add("xyz");
        carsNames.add("Maruti");
        carsNames.add("Nexa");

        LinkedList<String> carsNames1 = new LinkedList<>();
        carsNames1.add("hhh");
        carsNames1.add("ggg");

        carsNames.addAll(1,carsNames1);


        System.out.println("CarsName size  is :"+carsNames.size());

        System.out.println("CarsName size  is :"+carsNames.size());
        for(int j=0; j<carsNames.size();j++){
            System.out.println("Car : "+carsNames.get(j)+" on index"+j);
        }

        //  Hashset :     Unique & it does not maintains the order.

            String[] array={"Java","Python","PHP","C++"};

        HashSet<String> students = new HashSet<>();
        students.add("Ravi");
        students.add("John");
        students.add("Fahim");
        students.add("Ravi");
        students.add("Aaa");
        students.add("Bbb");
        students.add("Ccc");
        System.out.println("hashset:"+students);

        //LinkedHashset : Unique and it maintains insertion Order
         LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
            linkedHashSet.add("Ravi");
            linkedHashSet.add("John");
            linkedHashSet.add("Fahim");
            linkedHashSet.add("Ravi");
            linkedHashSet.add("Aaa");
            linkedHashSet.add("Bbb");
            linkedHashSet.add("Ccc");

            System.out.println("linkedHashSet:"+linkedHashSet);

         //     TreeSet : Unique and it maintains ascending Orders
            TreeSet<String> treeSet = new TreeSet<String>();
            treeSet.add("Ravi");
            treeSet.add("John");
            treeSet.add("Fahim");
            treeSet.add("Ravi");
            treeSet.add("Aaa");
            treeSet.add("Bbb");
            treeSet.add("Ccc");
            System.out.println("TreeSet:"+treeSet);

        HashMap<Book, Integer> books = new HashMap<>();
    }



}
