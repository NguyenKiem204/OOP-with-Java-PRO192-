/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortrect;

/**
 *
 * @author nkiem
 */
public class Rect {
    public int x;
    public int y;
    public int weight;
    public int height;
    public Rect(int x, int y, int weight, int height){
        this.x = x;
        this.y = y;
        this.weight = weight;
        this.height = height;
    }
    public int getPara(){
        return weight*height;
    }
    public int getArea(){
        return 2*(weight*height);
    }
    
}
