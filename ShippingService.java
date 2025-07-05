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
class ShippingService {
    public static void ship(List<Shippable> items) {
        if (items.isEmpty()) return;

        System.out.println("** Shipment notice **");
        Map<String, Integer> itemCount = new HashMap<>();
        Map<String, Double> itemWeight = new HashMap<>();
        double totalWeight = 0;

        for (Shippable item : items) {
            String name = item.getName();
            itemCount.put(name, itemCount.getOrDefault(name, 0) + 1);
            itemWeight.put(name, item.getWeight());
            totalWeight += item.getWeight();
        }

        for (String name : itemCount.keySet()) {
            System.out.println(itemCount.get(name) + "x " + name + " " + (itemWeight.get(name) * 1000) + "g");
        }

        System.out.printf("Total package weight %.1fkg\n", totalWeight);
    }
}

