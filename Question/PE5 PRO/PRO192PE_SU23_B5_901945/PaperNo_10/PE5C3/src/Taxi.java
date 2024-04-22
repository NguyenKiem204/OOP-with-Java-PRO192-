/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class Taxi implements Comparable<Taxi>{
    private String driver;
    private int salary;

    public Taxi() {
    }

    public Taxi(String driver, int salary) {
        this.driver = driver;
        this.salary = salary;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getDriver() {
        return driver;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return this.driver + "," + this.salary;
    }

    @Override
    public int compareTo(Taxi o) {
        int a = Integer.compare(salary, o.salary);
        if(a == 0){
            return driver.compareTo(o.driver);
        }
        return a;
    }
    
}
