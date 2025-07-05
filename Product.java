/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawry_assignment_e_commerce_system;

/**
 *
 * @author Nada
 */
public abstract class Product {
    private String Name;
    private double Price;
    private int Quantity;
   
    
    public Product(String Name , double Price, int Quantity ){
       this.Name=Name;
       this.Price=Price;
       this.Quantity=Quantity;
    }
    
    abstract boolean isExpired();
    
    public boolean isAvailable(int requestedQty) {
        
        boolean enoughStock = Quantity >= requestedQty;
        boolean notExpired = !isExpired();

        return enoughStock && notExpired;
    }
    
    public void reduce_stock(int quantity){
        Quantity-=quantity;
    }
    
    public String getName(){
        return Name;
    
    }
    
    public double getPrice(){
        return Price;
    }
}
