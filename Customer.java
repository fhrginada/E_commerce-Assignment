/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawry_assignment_e_commerce_system;

/**
 *
 * @author Nada
 */
public class Customer {
    private String Customer_Name;
    private double balance;

    public Customer(String Customer_Name, double balance) {
        this.Customer_Name = Customer_Name;
        this.balance = balance;
    }
    
    public boolean can_afford(double amount){
        return balance >=amount;
    }
    
    public void pay(double amount){
        balance-=amount;
    }
    
    public double getbalance(){
        return balance;
    }
}
