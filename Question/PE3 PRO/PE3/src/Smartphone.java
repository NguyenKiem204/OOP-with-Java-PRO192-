/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class Smartphone extends Product{
    private int price;
    private int internal_memory;
    private float weight;

    public Smartphone(String code, String name,  int internal_memory, float weight, int price ) {
        super(code, name);
        this.price = price;
        this.internal_memory = internal_memory;
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setInternal_memory(int internal_memory) {
        this.internal_memory = internal_memory;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public int getInternal_memory() {
        return internal_memory;
    }

    public float getWeight() {
        return weight;
    }
    
    public void showInfor(){
        System.out.println(getCode() + "-" + getName() + "-" + this.internal_memory + "GB" + "-" + this.weight+ "g"+"-"+this.price+"$"  );
       
    }
    public double buyNow(int quantity){
        double payment = quantity*price;
            if(getName().equals("IPHONE 14 PROMAX")&&quantity>=5){
                payment = payment*0.8;                
            }
               return payment;
    }
}

