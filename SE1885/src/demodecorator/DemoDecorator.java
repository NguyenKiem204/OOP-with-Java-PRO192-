/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demodecorator;

/**
 *
 * @author sonnt
 */
public class DemoDecorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player p = new BasicPlayer();
        p.shoot();
        
        
        p= new IcePlayer(p);
        p.shoot();
        
        p = new FirePlayer(p);
        p.shoot();
        
        
    }
    
}
