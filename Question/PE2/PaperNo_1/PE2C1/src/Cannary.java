/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class Cannary {
    private String place;
    private int song;

    public Cannary() {
    }

    public Cannary(String place, int song) {
        this.place = place;
        this.song = song;
    }

    public String getPlace() {
        String s = place.substring(0, 3).toLowerCase();
        return s;
    }

    public int getSong() {
        return song;
    }

    public void setSong(int song) {
        this.song = song;
    }
    
}
