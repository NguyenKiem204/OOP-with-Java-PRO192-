/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class SpecTaxi extends Taxi {

    private int salary;

    public SpecTaxi() {
    }

    public SpecTaxi(String driver, int age, int salary) {
        super(driver, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "," + salary; 
    }
    
    public void setData(){
        String s = super.getDriver().substring(0,1) + super.getAge() + super.getDriver().substring(2);
        super.setDriver(s);
    }
    
    public int getValue(){
        if(super.getAge() % 2 == 0){
            return salary;
        }else{
            return salary + super.getAge();
        }
    }
}
