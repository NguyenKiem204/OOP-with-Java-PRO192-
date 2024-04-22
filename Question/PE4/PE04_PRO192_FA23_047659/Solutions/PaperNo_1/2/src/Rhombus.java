/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Khanh Manh
 */
public class Rhombus extends Shape{

    double diagonal01;
    double diagonal02;
    double side;

    public Rhombus() {
    }

    public Rhombus( String name,double diagonal01, double diagonal02, double slide) {
        super(name);
        this.diagonal01 = diagonal01;
        this.diagonal02 = diagonal02;
        this.side = slide;
    }

    

    @Override
    public String toString() {
        String formattedDiagonal01 = String.format("%.2f", diagonal01);
        String formattedDiagonal02 = String.format("%.2f", diagonal02);
                String sidex = String.format("%.2f", side);

        return name.toUpperCase()+","+ formattedDiagonal01 + "," + formattedDiagonal02 + "," + sidex;
    }

    @Override
    public double calculateArea() {
        return (diagonal01*diagonal02)/2;
    }

    @Override
    public double calculatePerimeter() {
        return side*4;
    }

}
