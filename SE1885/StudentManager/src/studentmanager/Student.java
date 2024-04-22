/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanager;

/**
 *
 * @author nkiem
 */
public class Student {
    private String id;
    public String name;
    private int yob;
    private double gpa;

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("||Name: %-10s ||id: %8s || yob: %4d || Gpa: %2.1f",
                name, id, yob, gpa);
    }
    public void showAll(){
        System.out.printf("||Name: %-10s ||id: %8s || yob: %4d || Gpa: %2.1f\n",
                name, id, yob, gpa);
    }
}
