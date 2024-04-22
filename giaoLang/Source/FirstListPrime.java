/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listPrime;

import java.util.Scanner;

/**
 *
 * @author nkiem
 */
public class FirstListPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Nhap();
        int num = 1, count = 0;
            while(num <= n){
                if(isPrime(count)==true){
                    System.out.print(count + " ");
                    count ++;
                    num++;
                }else count ++;
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
   public static int Nhap(){
     int n;
     Scanner keyBoard = new Scanner(System.in);
     System.out.println("Your number: ");
     n = keyBoard.nextInt();
     return n;
 }
}
