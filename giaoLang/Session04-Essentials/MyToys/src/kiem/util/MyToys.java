/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiem.util;

import java.util.Scanner;

/**
 *
 * @author nkiem
 */
public class MyToys {

    public static final double PI = 3.1415;
    private static Scanner sc = new Scanner(System.in);

    public static int getAnInteger() {
        int n;
        do {
            try {
                System.out.println();
                //  n = sc.nextInt();
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Do you know input an integer!!!");
            }

        } while (true);
    }

    public static int getAnInteger(String inputMsg) {
        int n;
        do {
            try {
                System.out.println(inputMsg);
                //  n = sc.nextInt();
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Do you know input an integer!!!");
            }

        } while (true);
    }
}
