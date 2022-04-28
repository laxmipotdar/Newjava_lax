package com.company;


abstract class A{
    void display(){
        System.out.println();
    }
    abstract void show();

}
public class AbstractClassExample extends A {
   public void show(){
        System.out.println("gj");
    }

    public static void main(String[] args){
        A obj = new AbstractClassExample();
        obj.show();
        obj.display();

    }
}
