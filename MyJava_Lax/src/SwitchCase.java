package com.company;
import java.util.Scanner;
public class SwitchCase {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENtER the week");
        int i = sc.nextInt();
        switch(i){
            case 1 :
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Saturday");
                break;
        }
        System.out.println("OUt of the loop");


    }
}
