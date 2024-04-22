/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robot;

/**
 *
 * @author nkiem
 */
public class FirstVehicle extends Vehicle implements IFlyable{
 private int speed;

    public FirstVehicle(int speed) {
        this.speed = speed;
    }


    @Override
    public void displayInfo() {
        System.out.println("speed: "+ this.speed + " id: " + getId()+ " name: "+ getName() );
    }

   @Override
    public void up() {
        System.out.println("id: " + getId()+ " is flying UP");
    }

    @Override
    public void down() {
        System.out.println("id: " + getId() + " is flying Down");
    }
}
