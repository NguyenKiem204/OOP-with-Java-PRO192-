/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demodecorator;

/**
 *
 * @author sonnt
 */
public class DecorPlayer extends Player {
   public Player player;
   public DecorPlayer(Player p)
   {
       this.player = p;
   }
}
