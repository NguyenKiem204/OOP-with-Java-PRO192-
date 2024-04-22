/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class SpecPen extends Pen{
    private int price;

    public SpecPen() {
    }
    public SpecPen(String name, String color, int price) {
        super(name, color);
        this.price = price;
    }

    @Override
    public String toString() {
        return getName()+","+getColor()+","+this.price;
    }
    public void setData(){
        setName(getName()+ price);
    }
    public int getValue(){
        int count = 0;
      if(getColor().contains("Y")||getColor().contains("O") ){
          return price;
            }else return price*2;     
        }

    }

