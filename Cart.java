/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawry_assignment_e_commerce_system;
import java.util.*;
/**
 *
 * @author Nada
 */
public class Cart {
    List<Cart_item> items = new ArrayList<>();

    public void add(Product product, int quantity) {
        if (product.isAvailable(quantity)) {
            items.add(new Cart_item(product, quantity));
        } else {
            throw new IllegalArgumentException("Product is not available or expired.");
        }
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public double getSubtotal() {
        double sum = 0;
        for (Cart_item item : items) {
            sum += item.product.getPrice() * item.quantity;
        }
        return sum;
    }

    public List<Shippable> getShippableItems() {
        List<Shippable> shippables = new ArrayList<>();
        for (Cart_item item : items) {
            if (item.product instanceof Shippable) {
                for (int i = 0; i < item.quantity; i++) {
                    shippables.add((Shippable) item.product);
                }
            }
        }
        return shippables;
    }

    public List<Cart_item> getItems() {
        return items;
    }
    
}
