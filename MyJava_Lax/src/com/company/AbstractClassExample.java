package com.company;


abstract class ABS{
    void display(){
        System.out.println();
    }
    abstract void show();

}
public class AbstractClassExample extends ABS {
   public void show(){
        System.out.println("gj");
    }

    public static void main(String[] args){
        ABS obj = new AbstractClassExample();
        obj.show();
        obj.display();

    }
}
