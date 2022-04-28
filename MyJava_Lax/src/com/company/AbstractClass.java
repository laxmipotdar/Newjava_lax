package com.company;


abstract class Abc{
    void display(){
        System.out.println("This is from display");
    }
    abstract void show();
}
public class AbstractClass extends Abc {
    public void show(){
        System.out.println("from show child class");
    }
    public static void main(String[] args) {
        Abc obj = new AbstractClass();
        obj.show();
        obj.display();
    }
}