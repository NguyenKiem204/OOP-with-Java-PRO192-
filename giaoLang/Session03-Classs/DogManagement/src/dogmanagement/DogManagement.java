/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dogmanagement;

import data.Dog;

public class DogManagement {

    
    public static void main(String[] args) {
       Dog chiHu = new Dog("Chi HUHU", 2004, 40);
       chiHu.bark();
       chiHu.setWeight(5);
       chiHu.bark();
       Dog Ngao = new Dog("Ngao da", 2003, 25);
       System.out.println("Show all infor: ");
       String chiHudetail = chiHu.toString();
        System.out.println("chiHu detail: " + chiHudetail);
        System.out.println("Ngaoa detail: "+ Ngao.toString() );
        System.out.println(chiHu);
        System.out.println(Ngao);
    }
    
}
