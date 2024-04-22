/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import data.Student;

/**
 *
 * @author nkiem
 */
public class Stage {

    public static void main(String[] args) {
        Student s1 = new Student("HE188702", "Vĩnh", 2003, 8.7);
        System.out.println(s1);
        
       
        s1 = new Student("HE188777", "Kính", 2005, 8.8);
        s1.showAll();
    }
}
