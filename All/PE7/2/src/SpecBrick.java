/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class SpecBrick extends Brick {
    private int color;

    public SpecBrick() {
    }

    public SpecBrick( String place, int price,int color ) {
        super(place, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.getPlace() + "," + super.getPrice() + "," + this.color;
    }
    public void setData(){
        super.setPlace(getPlace().substring(0,2) + "BCA" + getPlace().substring(2));
    } 
    public int getValue(){
        int plus;
        if(this.color > 7){
            plus = 9;
        }
        else{
            plus = 6;
        }
        return super.getPrice() + plus;
    }
    
}
