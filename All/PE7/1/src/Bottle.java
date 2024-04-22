/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Bottle {
    private String maker;
    private int volumn;
    
public Bottle(){
    
}    
public Bottle(String maker, int volumn){
    this.maker = maker;
    this.volumn = volumn;
}

    public String getMaker() {
        return maker.toLowerCase();
    }

    public int getVolumn() {
        return volumn;
    }

    public void setVolumn(int volumn) {
        this.volumn = volumn;
    }

}
