/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
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

    public String getName() {
        int lengthOfStringName = name.length();
        String s = 
         name.substring(lengthOfStringName - 3, lengthOfStringName-2) + 
         name.toLowerCase().substring(lengthOfStringName - 2, lengthOfStringName - 1)+
         name.substring(lengthOfStringName - 1, lengthOfStringName);
        return s;
    }

    public int getLeg() {
        return leg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
    
    
}
