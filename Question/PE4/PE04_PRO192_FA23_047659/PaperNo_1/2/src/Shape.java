/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public abstract class Shape {
    private String name;

    public Shape() {
    }

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name.toUpperCase();
    }
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
