/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listprime;

import java.util.Scanner;

/**
 *
 * @author nkiem
 */
public class ListPrime {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       int a = Nhap1();
       int b = Nhap2();
       System.out.println("List Prime for " + a + " to " + b);
        for (int i = a; i < b; i++) {
           if(isPrime(i)==true){
               System.out.print(i + " ");
           }
       }
        System.out.print("\n");
    }
 public static boolean  isPrime(int n){
    if(n<2) return false;
    else{
     for (int i = 2; i<= Math.sqrt(n); i++) {
          if(n%i==0){
              return false;
           }    
        }
      return true;
     }
   }
 public static int Nhap1(){
     int n;
     Scanner keyBoard = new Scanner(System.in);
     System.out.println("Your number: ");
     n = keyBoard.nextInt();
     return n;
 }
 public static int Nhap2(){
     int n;
     Scanner keyBoard = new Scanner(System.in);
     System.out.println("Your number: ");
     n = keyBoard.nextInt();
     return n;
 }
}
