/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
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

    public String getDriver() {
        return driver;
    }

    public int getAge() {
        return age;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return driver + "," + age;
    }

}
