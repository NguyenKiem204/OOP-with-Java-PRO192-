/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pheptinh;

import java.util.Scanner;

/**
 *
 * @author nkiem
 */
public class PhepTinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a  = nhap1();
        double b  = nhap2();
        double c  = -b/a;
        if(a == 0){
            System.out.print("0 không thỏa mãn\n");
        }else
        System.out.println("x = " + c);
    }
    public static double nhap1(){
        double n;
        Scanner banphim = new Scanner(System.in);
                System.out.print("Enter a = ");
                n = banphim.nextInt();
        return n;
                     
    }
    public static double nhap2(){
        double n;
        Scanner banphim = new Scanner(System.in);
                System.out.print("Enter b = ");
                n = banphim.nextInt();
        return n;
                     
    }
}
