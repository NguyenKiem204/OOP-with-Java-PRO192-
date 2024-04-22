/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studenprofile;

import java.util.Scanner;

/**
 *
 * @author nkiem
 */
public class StudenProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inputProfile();
    }
    public static void inputProfile(){
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine().toUpperCase();
//        yob = sc.nextInt();
//        sc.nextLine();
        yob = Integer.parseInt(sc.nextLine());
        address = sc.nextLine().toUpperCase();
        System.out.println("Name: " + name);
        System.out.println("yob: "+ yob);
        System.out.println("address: " + address);
    }
}
