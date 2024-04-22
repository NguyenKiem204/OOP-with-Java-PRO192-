/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class Song implements Comparable<Object>{
private String name;
private int duration;

    public Song() {
    }

    public Song(String name, int duration) {
        if(duration < 1){
            this.duration = 1;
        }else this.duration = duration;
        this.name = name.toUpperCase();

    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return name + "," + duration;
    }

    @Override
    public int compareTo(Object o) {
        return this.name.compareTo(name);
    }
    
}
