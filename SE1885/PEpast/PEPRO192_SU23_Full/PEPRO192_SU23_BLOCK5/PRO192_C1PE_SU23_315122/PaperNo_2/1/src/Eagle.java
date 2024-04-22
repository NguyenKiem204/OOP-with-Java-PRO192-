/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
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

    public String getType() {
        String s = type.charAt(type.length() - 1) + "" + type.charAt(1);
        type = s;
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
