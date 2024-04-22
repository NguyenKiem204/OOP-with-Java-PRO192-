/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class Rhombus extends Shape {

    private double diagonal01;
    private double diagonal02;
    private double side;
    public Rhombus() {
    }

    public Rhombus(String name, double diagonal01, double diagonal02, double side) {
        super(name);
        this.diagonal01 = diagonal01;
        this.diagonal02 = diagonal02;
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (diagonal01 * diagonal02) / 2;
    }

    @Override
    public double calculatePerimeter() {
    return this.side*4;
    }

    @Override
    public String toString() {
        return String.format("%s,%.2f,%.2f,%.2f", getName(), diagonal01, diagonal02, side);
    }
    
}
