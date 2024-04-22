
import robot.FirstVehicle;
import robot.IFlyable;
import robot.IShootable;
import robot.SecondVehicle;
import robot.Vehicle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sonnt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int speed = 10;
        Vehicle a = new FirstVehicle(speed);
        a.setId(1);
        a.setName("A");
        a.displayInfo(); 
        
        String bullet = "Laser";
        int damage = 8;
        Vehicle b = new SecondVehicle(bullet, damage);
        b.setId(2);
        b.setName("B");
        b.displayInfo();
        
        IFlyable fa = (IFlyable)a;
        fa.up();
        fa.down();
        
        IFlyable fb = (IFlyable)b;
        fb.up();
        fb.down();
        
        IShootable sb = (IShootable)b;
        sb.shoot();
    }
    
}
