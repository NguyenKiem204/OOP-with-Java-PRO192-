/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author nkiem
 */
public class BakeryTest {
    public static void main(String[] args) {
        BakeryFactory europeanFactory = new EuropeanBakeryFactory();
        Cake europeanBread = europeanFactory.createBread();
        europeanBread.bake();

        BakeryFactory asianFactory = new AsianBakeryFactory();
        Cake asianPastry = asianFactory.createPastry();
        asianPastry.bake();
    }
}
