

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class Table {
    private String name;
    private int leg;

    public Table() {
    }

    public Table(String name, int leg) {
        this.name = name;
        this.leg = leg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public String getName() {
        int l = name.length();
        String s = name.substring(l-3, l-2) + name.substring(l-2, l-1).toLowerCase() + name.substring(l-1, l);
        return s;
    }

    public int getLeg() {
        return leg;
    }
    
}
