package com.company;

public class OperatorExample {
    public static void main(String args[]){

        int x= 10;
        System.out.println("X=" + x);
        System.out.println("X++" + x++);
        System.out.println("X=" + x);
        System.out.println("++x" + ++x);
        System.out.println("X=" + x);

        int age = 18;
        char Gender = 'F';
        int x1 = 6;
        if(++age >=18 | Gender == 'M'){
            System.out.println("Inside the loop");

        }else{
            System.out.println("else block");
        }
        System.out.println("age =" + age);

         int x3 = 13;
         if(x3%2  == 0){
             System.out.println("Even");
         }else{
             System.out.println("Odd");
         }
         System.out.println(x3%2 == 0 ? "Even" : "Odd");
    }
}
