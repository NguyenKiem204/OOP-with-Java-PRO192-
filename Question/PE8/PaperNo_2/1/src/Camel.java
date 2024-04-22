/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class Camel {
    private String desert;
    private int step;

    public Camel() {
    }

    public Camel(String desert, int step) {
        this.desert = desert;
        this.step = step;
    }

    public String getDesert() {
        return desert.toLowerCase();
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }
    
}
