/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Khanh Manh
 */
public class Employee {
    int id;
    String name;
    double salary;
    int seniority;

    public Employee() {
    }

    public Employee(int id, String name, double salary, int seniority) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.seniority = seniority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        if (seniority <= 0 ) {
            this.seniority = 1;
        }else
        this.seniority = seniority;
    }
    public void updateSalary(){
        if (seniority>=3 && seniority<=5) {
            salary = salary*1.3;
        }else if (seniority>=6 && seniority<=10) {
            salary = salary*1.5;
        }else{
            salary = salary*2;
        }
    }

    @Override
    public String toString() {
        return + id + "," + name + "," + salary + "," + seniority ;
    }
    
}
