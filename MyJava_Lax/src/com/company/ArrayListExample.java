package com.company;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ArrayListExample {

    static void linkedFunction(){
        List<String> li = new LinkedList<String>();
        li.add("abc");
        li.add("dsfbdsiu");
        li.add("dsfbdsiu");

        for(String eachli : li){
            System.out.println("linkedlist ========"+eachli);

        }
        for(int i=0;i<+li.size();i++){
            System.out.println(li.get(i));
        }


    }

    static void arrayFunction() {
        List<String> li = new ArrayList<String>();
        li.add("abc");
        li.add("dsfbdsiu");
        li.add("dsfbdsiu");

        for (String eachli : li) {
            System.out.println(eachli);

        }
        for (int i = 0; i < +li.size(); i++) {
            System.out.println(li.get(i));
        }
    }

    public static void main(String[] args) {
        arrayFunction();
        linkedFunction();
    }
}
