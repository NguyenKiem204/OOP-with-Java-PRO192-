/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipadress;

/**
 *
 * @author nkiem
 */
public class LAN extends Server {

    public LAN(String Adress, int netWorkAdress, int prefix, int BroadCastAddress, String subNetMask, int theFirstIP, int theLastIP, int NumberOfUsableIP) {
        super(Adress, netWorkAdress, prefix, BroadCastAddress, subNetMask, theFirstIP, theLastIP, NumberOfUsableIP);
    }

   
    


    @Override
   public String toString() {
    return String.format("|| %-15s || %-10s || %-15s || %-12s || %-12s || %-12s ||",  
        String.format("%s%d/%d", getAdress(), getNetWorkAdress(),getPrefix()), 
        String.format("%s%d", getAdress(), getBroadCastAddress()), 
        getSubNetMask(),
        String.format("%s%d", getAdress(), getTheFirstIP()),
        String.format("%s%d", getAdress(), getTheLastIP()),  
        getNumberOfUsableIP());
}

    
}
