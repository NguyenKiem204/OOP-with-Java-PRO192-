/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robot;

/**
 *
 * @author nkiem
 */
public abstract class Vehicle {
    private int Id;
    private String Name;

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

   
    
    public abstract void displayInfo();
    
}
