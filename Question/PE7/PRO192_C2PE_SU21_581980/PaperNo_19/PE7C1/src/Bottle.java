/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class Bottle {
    private String maker;
    private int volume;

    public Bottle() {
    }

    public Bottle(String maker, int volume) {
        this.maker = maker;
        this.volume = volume;
    }

    public String getMaker() {
        return maker.toLowerCase();
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
}
