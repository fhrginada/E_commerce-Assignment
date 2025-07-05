/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawry_assignment_e_commerce_system;

/**
 *
 * @author Nada
 */
public class NonExpirable_shippable_product extends Product implements Shippable {
    
    private double weight;
    
    NonExpirable_shippable_product(String Name, double Price, int Quantity, double weight) {
        super(Name, Price, Quantity);
        this.weight = weight;
    }
    
    @Override
    public boolean isExpired(){
        return false;
    }
    
    @Override
    public double getWeight(){
        return weight;
    }
}
