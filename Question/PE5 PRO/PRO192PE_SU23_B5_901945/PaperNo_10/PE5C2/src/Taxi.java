/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class Taxi {
    private String driver;
    private int age;

    public Taxi() {
    }

    public Taxi(String driver, int age) {
        this.driver = driver;
        this.age = age;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getDriver() {
        return driver;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.driver + "," + this.age;
    }
    
}
