package com.company;

import java.util.Scanner;

public class ItemType {
    private String name;
    private Double costPerDay;
    private Double deposit;

    public void setName(String name) {
        this.name = name;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public String getName() {
        return name;
    }

    public Double getDeposit() {
        return deposit;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void display() {
        System.out.println("Item type details");
        System.out.println("Name :" + getName());

        System.out.println("Deposit :" + String.format("%.2f",getDeposit()));
        System.out.println("CostPerDay :" + String.format("%.2f",getCostPerDay()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item type Name");
        String name = sc.nextLine();
        System.out.println("Enter Cost per day");
        Double perDayCost = sc.nextDouble();
        System.out.println("Enter the deposit");
        Double deposits = sc.nextDouble();
        ItemType items = new ItemType();
        items.setName(name);
        items.setDeposit(deposits);
        items.setCostPerDay(perDayCost);
        items.display();

    }
}
