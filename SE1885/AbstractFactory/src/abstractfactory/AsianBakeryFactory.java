/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author nkiem
 */
public class AsianBakeryFactory implements BakeryFactory {

    @Override
    public Cake createBread() {
       return new AsianBread();
            
    }

    @Override
    public Cake createPastry() {
        return new AsianPastry();
        

    }
    
    
}
