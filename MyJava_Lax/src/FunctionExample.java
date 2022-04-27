package com.company;

import java.util.Scanner;

public class FunctionExample {
 public void show(){
     System.out.println("Called by the function");
 }

 public float show(int a, int b){
     float c = a+b;
     System.out.println("a+b = " + c);
     return a+b;
 }

 public String st(String message){
     return "Welcome";
 }

    public void show(int a, int b,float c){

        System.out.println(a+b+c);

    }
    public void xyz(String x){

        System.out.println("from function" + x);

    }

 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
     FunctionExample fObj =new FunctionExample();
     fObj.show();
     fObj.show(3,5);
     fObj.show(2,4,7);
    String m =  fObj.st("hello");
     fObj.xyz(m);
 }

}
