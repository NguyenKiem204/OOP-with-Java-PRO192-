/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demowriter;

/**
 *
 * @author nkiem
 */
public class Student {
    private String name;
    private String id;
    private int yob;
    private double gpa;

    public Student(String name, String id, int yob, double gpa) {
        this.name = name;
        this.id = id;
        this.yob = yob;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " || Id: " + this.id + " || Yob: " + this.yob + " || GPA : " + this.gpa;
    }
    
}
