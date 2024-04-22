/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package samurai;

import java.util.Scanner;

/**
 *
 * @author nkiem
 */
public class Samurai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inputProfile();
        inputProfileSmart();
    }

    public static void inputProfileSmart() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine().toUpperCase();
        while (true) {
            try {
                System.out.print("Enter Yob: ");
                yob = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Do you know input positive number: ");
            }
        }

        System.out.print("Enter address: ");
        address = sc.nextLine().toUpperCase();
        System.out.println("Name: " + name);
        System.out.println("yob: " + yob);
        System.out.println("address: " + address);
    }

    public static void inputProfile() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine().toUpperCase();
        try {
            System.out.print("Enter Yob: ");
            yob = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            yob = 10;
        }
        System.out.print("Enter address: ");
        address = sc.nextLine().toUpperCase();
        System.out.println("Name: " + name);
        System.out.println("yob: " + yob);
        System.out.println("address: " + address);
        
    }
}
