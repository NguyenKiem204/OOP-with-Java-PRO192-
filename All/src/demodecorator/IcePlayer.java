/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demodecorator;

/**
 *
 * @author sonnt
 */
public class IcePlayer extends DecorPlayer {

    public IcePlayer(Player p) {
        super(p);
    }
    public void shoot()
    {
        player.shoot();
        System.out.println("Ice ");
    }
}
