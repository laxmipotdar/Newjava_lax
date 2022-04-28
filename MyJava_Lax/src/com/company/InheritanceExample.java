package com.company;

class C{

        void add1(int a, int b){
        System.out.println(a+b);
        }
    void show(){
        System.out.println("SuperClass");
    }
        }
public class InheritanceExample extends C {
     void display(){
         System.out.println("display method");
     }
     void add(int a,int b,int c){
         System.out.println(a+b+c);
     }

    public static void main(String[] args) {
        C obj = new C();
        obj.show();

        InheritanceExample obj1 = new InheritanceExample();
        obj1.show();
    }
}
class D extends InheritanceExample{

    public static void main(String[] args){
        D obj = new D();
        obj.show();
        obj.display();
        obj.add1(3,4);
    }

}
