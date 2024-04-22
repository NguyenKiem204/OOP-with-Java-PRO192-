/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipadress;

/**
 *
 * @author nkiem
 */
public class Server{
    public String Adress; 
    private int netWorkAdress;
    private int prefix;
    private int BroadCastAddress;
    private String subNetMask;
    private int theFirstIP;
    private int theLastIP;
    private int NumberOfUsableIP;

    public Server(String Adress, int netWorkAdress, int prefix, int BroadCastAddress, String subNetMask, int theFirstIP, int theLastIP, int NumberOfUsableIP) {
        this.Adress = Adress;
        this.netWorkAdress = netWorkAdress;
        this.prefix = prefix;
        this.BroadCastAddress = BroadCastAddress;
        this.subNetMask = subNetMask;
        this.theFirstIP = theFirstIP;
        this.theLastIP = theLastIP;
        this.NumberOfUsableIP = NumberOfUsableIP;
    }

   

    
    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public void setNetWorkAdress(int netWorkAdress) {
        this.netWorkAdress = netWorkAdress;
    }

    public void setPrefix(int prefix) {
        this.prefix = prefix;
    }

    public void setBroadCastAddress(int BroadCastAddress) {
        this.BroadCastAddress = BroadCastAddress;
    }

    public void setSubNetMask(String subNetMask) {
        this.subNetMask = subNetMask;
    }

    public void setTheFirstIP(int theFirstIP) {
        this.theFirstIP = theFirstIP;
    }

    public void setTheLastIP(int theLastIP) {
        this.theLastIP = theLastIP;
    }

    public void setNumberOfUsableIP(int NumberOfUsableIP) {
        this.NumberOfUsableIP = NumberOfUsableIP;
    }

    public int getNetWorkAdress() {
        return netWorkAdress;
    }

    public int getPrefix() {
        return prefix;
    }

    public int getBroadCastAddress() {
        return BroadCastAddress;
    }

    public String getSubNetMask() {
        return subNetMask;
    }

    public int getTheFirstIP() {
        return theFirstIP;
    }

    public int getTheLastIP() {
        return theLastIP;
    }

    public int getNumberOfUsableIP() {
        return NumberOfUsableIP;
    }

}
