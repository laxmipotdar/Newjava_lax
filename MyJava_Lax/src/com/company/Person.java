package com.company;

public class Person {
    float weight;
    float height;
    int age;
    String name;

    public static void main(String[] args) {
        Person11 p1 = new Person11();
        p1.weight = 55.0f;
        p1.height = 5.5f;
        p1.age = 35;
        p1.name = "Harshada";

        Person11 p2 = new Person11();
        p2.weight = 50.0f;
        p2.height = 5.6f;
        p2.age = 26;
        p2.name = "chhavi";

        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.height);
        System.out.println(p1.weight);

        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.height);
        System.out.println(p2.weight);
    }
}


