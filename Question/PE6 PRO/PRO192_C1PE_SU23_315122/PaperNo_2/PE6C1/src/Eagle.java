/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class Eagle {
    private String type;
    private int quantity;

    public Eagle() {
    }

    public Eagle(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        int l = type.length();
        String s = type.substring(l-1) + type.substring(1, 2);
        return s;
    }

    public int getQuantity() {
        return quantity;
    }
    
}
