/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawry_assignment_e_commerce_system;

/**
 *
 * @author Nada
 */
public class Checkout {
    
    public static void checkout(Customer customer, Cart cart) {
        if (cart.isEmpty()) {
            System.out.println(" Error: Cart is empty.");
            return;
        }

        for (Cart_item item : cart.getItems()) {
            if (!item.product.isAvailable(item.quantity)) {
                System.out.println(" Error: Product " + item.product.getName() + " is expired or out of stock.");
                return;
            }
        }

        double subtotal = cart.getSubtotal();
        double shippingFee = cart.getShippableItems().isEmpty() ? 0 : 30;
        double totalAmount = subtotal + shippingFee;

        if (!customer.can_afford(totalAmount)) {
            System.out.println("Error: Insufficient balance.");
            return;
        }

        
        for (Cart_item item : cart.getItems()) {
            item.product.reduce_stock(item.quantity);
        }

        
        customer.pay(totalAmount);
        ShippingService.ship(cart.getShippableItems());

        
        System.out.println("** Checkout receipt **");
        for (Cart_item item : cart.getItems()) {
            System.out.println(item.quantity + "x " + item.product.getName() + " " + (item.quantity * item.product.getPrice()));
        }
        System.out.println("----------------------");
        System.out.println("Subtotal " + subtotal);
        System.out.println("Shipping " + shippingFee);
        System.out.println("Amount " + totalAmount);
        System.out.println("Balance left: " + customer.getbalance());
    }
}

