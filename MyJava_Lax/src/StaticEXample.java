package com.company;
        public class StaticEXample {
            static int a;
            int a2;
            static int b2;

            static void show(){
                StaticEXample st1 = new StaticEXample();
                st1.a2 = 4;
                a = 3;
                b2 = 7;
                System.out.println("Static function");
            }

            public static void main(String[] args){
                StaticEXample st = new StaticEXample();
                st.a2 = 9;
                a= 3;
                b2 = 5;
                System.out.println("" + st.a2);
                System.out.println("" + a);
                System.out.println("" + b2);


            }
}
