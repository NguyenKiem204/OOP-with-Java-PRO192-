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

    public static void main(String[] args) {
        Player p = new BasicPlayer();
        p.shoot();
        System.out.println("");
        p = new IcePlayer(p);
        p.shoot();
        System.out.println("");
        p = new FirePlayer(p);
        p.shoot();
        System.out.println("");

    }

}
//run:
//Basic 
//Basic Ice 
//Basic Ice Fire 
//BUILD SUCCESSFUL (total time: 0 seconds)