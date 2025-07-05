/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawry_assignment_e_commerce_system;

/**
 *
 * @author Nada
 */
public class Non_shippable_product extends Product {

    public Non_shippable_product(String Name , double Price, int Quantity) {
        super(Name,Price,Quantity);
    }
    
    @Override
    public boolean isExpired(){
        return false;
    }
    
    
}
