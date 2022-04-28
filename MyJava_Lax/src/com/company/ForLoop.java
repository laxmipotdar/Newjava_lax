package com.company;
public class ForLoop {
    public static void main(String args[]){
        for(int i=0 ; i<=10 ; i++){
            System.out.println("i ==== " + i);
        }

        int i = 0;
        while(i<=5){
            System.out.println("i=====" + i);
            i++;
        }

        int x = 15;

        do{
            System.out.println("x++++" + x);
            x++;
        }while(x<=10);


        do{
            System.out.println("x ===+++++" + x);
            x++;
        }while(x<=16);
        System.out.println("x&&&&&&"+ x);


    }
}
