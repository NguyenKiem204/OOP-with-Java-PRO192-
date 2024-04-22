/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mhieu
 */
public class Cape {

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

    public void setTailor(String tailor) {
        this.tailor = tailor;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return tailor + "," + color;
    }
}
