/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiem.main;

import kiem.util.MyToys;

/**
 *
 * @author nkiem
 */
public class Stage {

    public static void main(String[] args) {
        System.out.println("PI: " + MyToys.PI);
//        MyToys.PI = 4;
//        System.out.println("PI: " + MyToys.PI);
//        int n = MyToys.getAnInteger();
//        System.out.println("n: " + n);
        
        int choice =  MyToys.getAnInteger("Enter a number for (1....9)");
        System.out.println("Your Choice is: " + choice);
    }
}
