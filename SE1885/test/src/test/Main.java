/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.RandomAccessFile;

class Van {
    String driver; int rate;
    Van() { driver="unknown"; rate=5; }
    Van(String driver, int rate) {
        this.driver=driver; this.rate=rate;
    }
    public String toString() { return(driver+","+rate); }
}

class SpecVan extends Van {
    int type;

    public SpecVan() {
    }
    
    SpecVan(String driver, int rate, int type) {
        super(driver,rate);
        this.type=type;
    }
    void display() {
        String s = "("+super.toString()+","+type+")";
        System.out.println(s);
    }
}

public class Main {
    public static void main(String[] args) {
        SpecVan x = new SpecVan();
        SpecVan y = new SpecVan("Hoa",20,10);
        x.display(); y.display();
        System.out.println();
       
    }
}