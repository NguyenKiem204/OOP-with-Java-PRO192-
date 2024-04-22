/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class SpecTaxi extends Taxi{
    private int salary;

    public SpecTaxi() {
    }

    public SpecTaxi( String driver, int age, int salary) {
        super(driver, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getDriver()+","+getAge()+","+this.salary;
    }
    public void setData(){
        int l = getDriver().length();
        String s =  getDriver().substring(0, 1) + getAge() + getDriver().substring(2);
        setDriver(s);
    }
    public int getValue(){
        if(getAge()%2==0){
            return this.salary;
        }else return this.salary+getAge();
    }
}
