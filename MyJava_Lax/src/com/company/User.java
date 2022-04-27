package com.company;

import java.util.Scanner;

public class User {

    private String name;
    private String userName;
    private String password;
    private Long phoneNumber;

    public User(){

    }
    public User(String name, String userName , String password,Long phoneNumber){

    }
    public void setName(String name){
        this.name = name;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setPassword(String password){this.password = password;}
    public void setPhoneNumber(Long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getname() {
        return name;
    }
    public String getUserName(){return userName;}
    public String getPassword() {
        return password;
    }
    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public boolean comparePhoneNumber(User user1,User user2){
       if(user1.phoneNumber == user2.phoneNumber){
           System.out.println("Same PhoneNumber");
           return true;

       }else{
           System.out.println("Different Phone number");
           return false;

       }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = sc.nextLine();
        System.out.println("Enter UserName");

    }
}
