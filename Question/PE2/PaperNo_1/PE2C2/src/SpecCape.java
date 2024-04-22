/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class SpecCape extends Cape{
    private int type;

    public SpecCape() {
    }

    public SpecCape( String tailor, int color, int type) {
        super(tailor, color);
        this.type = type;
    }

    @Override
    public String toString() {
        return getTailor() + "," + getColor() + "," + this.type;
    }
    public void setData(){
        int l = getTailor().length();
        String s = getTailor().substring(0, l-2) + "XYZ";        
        setTailor(s);
    }
    public int getValue(){
        for (int i = 0; i < getTailor().length(); i++) {
            if(Character.isDigit(getTailor().charAt(0))){
                return getColor() + 11;
            }else return getColor() + 4;     
        }
        return 0;
    }
}
