/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawry_assignment_e_commerce_system;
import java.time.LocalDate;
/**
 *
 * @author Nada
 */

public class Expirable_Shippable_product extends Product implements Shippable {
    LocalDate expiry_date;
    double weight;

    Expirable_Shippable_product(String Name, double Price, int Quantity, double weight, LocalDate expiry_date) {
        super(Name, Price, Quantity);
        this.weight = weight;
        this.expiry_date = expiry_date;
    }
    
    @Override
    public boolean isExpired(){
        return LocalDate.now().isAfter(expiry_date);
    }
    
    @Override
    public double getWeight(){
        return weight;
    }
    
}
