/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demotrycatch;

import java.util.Scanner;

/**
 *
 * @author nkiem
 */
public class DemoTryCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap bat ki: ");
        String a = sc.nextLine();
        try {
            int b = Integer.parseInt(a);
            System.out.println(b + " is  integer");
        } catch (Exception e) {
            System.out.println("Error Integer");
        }

        try {
            float c = Float.parseFloat(a);
            System.out.println(c + " is float ");
        } catch (Exception fl) {
            System.out.println("Error Float");
        }
        try {
           String d = a;
           System.out.println(d + " is String");
        } catch (Exception e) {
            System.err.println("Error String");
        }
    }
}
