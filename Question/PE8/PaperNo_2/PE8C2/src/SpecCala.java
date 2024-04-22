/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class SpecCala extends Cala{
    private int color;

    public SpecCala() {
    }

    public SpecCala( String owner, int price, int color) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return getOwner()+","+getPrice()+","+this.color;
    }
    
    public void setData(){
        String s = getOwner().substring(0, 1) +"XX" + getOwner().substring(2);
        setOwner(s);
    }
    public int getValue(){
        if(this.color%2!=0){
            return getPrice()+3;
        }else return getPrice()+7;
    }
}
