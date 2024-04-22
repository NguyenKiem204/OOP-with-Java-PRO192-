/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.ArrayList;

/**
 *
 * @author sonnt
 */
public class Order implements Comparable<Order>{
    private int id;
    private ArrayList<OrderLine> lines = new ArrayList<>();
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    

    public Order(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<OrderLine> getLines() {
        return lines;
    }

    public void setLines(ArrayList<OrderLine> lines) {
        this.lines = lines;
    }

   public float getTotalPayment() {
    float sum = 0;
    for (OrderLine line : lines) {
        sum += (float) line.getQuantity() * line.getProduct().getPrice();
    }
    return sum;
}
@Override
    public int compareTo(Order o) {
        return Float.compare(o.getTotalPayment(), this.getTotalPayment());
    }
   

    
}
