/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class Cape{
    private String tailor;
    private int color;

    public Cape() {
    }

    public Cape(String tailor, int color) {
        this.tailor = tailor;
        this.color = color;
    }

    public String getTailor() {
        return tailor;
    }

    public int getColor() {
        return color;
    }

    public void setTailor(String tailor) {
        this.tailor = tailor;
    }

    @Override
    public String toString() {
        return this.tailor+","+this.color;
    }

   
    
}
