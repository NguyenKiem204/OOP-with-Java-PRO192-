/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorttriangle;

/**
 *
 * @author nkiem
 */
public class Triangle {
    public Point A;
    public Point B;
    public Point C;
    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;        
    }
    
    public double distance(Point E1, Point E2){
        return Math.sqrt(Math.pow((E2.x - E1.x), 2) + Math.pow((E2.y - E1.y), 2));
    }
    public double Parameter(Point A, Point B, Point C){
        return  (distance(A, B) + distance(B, C) + distance(C, A));
    }

   
}
