/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fawry_assignment_e_commerce_system;
import java.time.LocalDate;
/**
 *
 * @author Nada
 */
public class Fawry_Assignment_e_commerce_system {

    public static void main(String[] args) {
        
        Product cheese = new Expirable_Shippable_product("Cheese", 100, 5, 0.2, LocalDate.now().plusDays(2));
        Product biscuits = new Expirable_Shippable_product("Biscuits", 150, 3, 0.7, LocalDate.now().plusDays(1));
        Product tv = new NonExpirable_shippable_product("TV", 300, 2, 3.0);
        Product scratchCard = new Non_shippable_product("Scratch Card", 50, 10);

        
        Customer customer = new Customer("Nada", 500);

        
        Cart cart = new Cart();
        cart.add(cheese, 2);
        cart.add(biscuits, 1);
        cart.add(scratchCard, 1);

        
        Checkout.checkout(customer, cart);
    }
}
