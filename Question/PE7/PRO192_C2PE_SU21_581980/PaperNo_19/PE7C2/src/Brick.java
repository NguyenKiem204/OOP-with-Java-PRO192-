/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class Brick {
    private String place;
    private int price;

    public Brick() {
    }

    public Brick(String place, int price) {
        this.place = place;
        this.price = price;
    }

    public String getPlace() {
        return place;
    }

    public int getPrice() {
        return price;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return this.place + "," + this.price;
    }
    
}
