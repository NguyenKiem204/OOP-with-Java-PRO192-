/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mhieu
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
        int n = place.length();
        return place.substring(0, 3).toLowerCase() + place.substring(3,n);
    }



    public int getSong() {
        return song;
    }

    public void setSong(int song) {
        this.song = song;
    }
}

    