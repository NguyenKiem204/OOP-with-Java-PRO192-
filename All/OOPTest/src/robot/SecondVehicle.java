/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robot;

/**
 *
 * @author nkiem
 */
public class SecondVehicle extends Vehicle implements IFlyable, IShootable{
    private String bullet;
    private int damage;

    public SecondVehicle(String bullet, int damage) {
        this.bullet = bullet;
        this.damage = damage;
    }

  
    
    @Override
    public void displayInfo() {
        System.out.println("bullet: "+ this.bullet + " damage: " + damage + " id: " + getId()+ " name: "+ getName() );
    }

     @Override
    public void up() {
        System.out.println("GO UP");
    }

    @Override
    public void down() {
        System.out.println("GO DOWN");
    }

    @Override
    public void shoot() {
        System.out.println("SHOOT with bullet: " + this.bullet);
    }
}

