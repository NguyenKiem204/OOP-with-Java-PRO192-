/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author nkiem
 */
interface Eating {

    public void gethour();

    public int getMell();

}

abstract class Meal implements Eating {

    public void gethour() {
        System.out.println(getMell());
    }
}

public class Main2 {
void f(String t){
    System.out.println("String");
}
void f(StringBuffer h){
    System.out.println("StringBuffer");
}
    public static void main(String[] args) {
        Eating e = new Meal() {
            @Override
            public int getMell() {
                return 0;
            }
        };
           e.gethour();
    
    Integer a = new Integer(0);
    Integer b = new Integer(0);
        System.out.println(a==b);
        Main2 l = new Main2();
        l.f("ABC");

    }
}
