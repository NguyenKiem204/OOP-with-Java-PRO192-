/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nkiem
 */
public class Doctor extends Person implements IStudy{
private int Level;

    public void setLevel(int Level) {
        this.Level = Level;
    }

    public Doctor() {
    }

    @Override
    public void study(String s) {
        System.out.println(getName() + " Level: " + this.Level + " is Learning " + s);
    }
    
}
