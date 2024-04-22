/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.text.Collator;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author sonnt
 */
public class Product {
    private int id;
    private float price;

    public Product(int id, float price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    public static Product getMostExpensive(ArrayList<Product> products) {
    Product mostExpensive = null;
    float maxPrice = Float.MIN_VALUE;
    for (Product product : products) {
        if (product.getPrice() > maxPrice) {
            maxPrice = product.getPrice();
            mostExpensive = product;
        }
    }
    return mostExpensive;
}
    
}
