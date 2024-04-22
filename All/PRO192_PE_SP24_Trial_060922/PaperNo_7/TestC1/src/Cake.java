

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class Cake {
    private String maker;
    private int price;

    public Cake() {
    }

    public Cake(String maker, int price) {
        this.maker = maker;
        this.price = price;
    }

    public String getMaker() {
        int l = this.maker.length();
        String a = this.maker.substring(0, l-1).toLowerCase();
        String b = this.maker.substring((l-1)).toUpperCase();
        return a+b;
    }

    public int getPrice() {
      
        return price;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
