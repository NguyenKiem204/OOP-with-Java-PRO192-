/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demodecorator;

/**
 *
 * @author sonnt
 */
public class BasicPlayer extends Player {
    @Override
    public void shoot()
    {
        super.shoot();
        System.out.print("Basic ");
    }
}
