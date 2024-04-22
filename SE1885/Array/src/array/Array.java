/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nkiem
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] array1; // array1[]
       int array2[];
       array2 = new int[]{1,3,5,2,7};
       int n;
        System.out.println("Số lượng phần tử có trong mảng là: ");
        Scanner SC = new Scanner(System.in);
        n = SC.nextInt();
        array1 = new int[n];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = SC.nextInt();
        }
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.printf(array1[i]+ " ");
        }
        
               System.out.print("\n");
    }
    
}
