/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringsplit;

import java.util.Scanner;

/**
 *
 * @author nkiem
 */
public class StringSplit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    s = s.replaceAll("[^1-9]", ""); 
    String[] l = s.split(" ");
    int sum = 0;
    for (int i = 0; i < l.length; i++) {
        sum += Integer.parseInt(l[i]);
    }
    System.out.println("sum = " + sum);
}

}

    