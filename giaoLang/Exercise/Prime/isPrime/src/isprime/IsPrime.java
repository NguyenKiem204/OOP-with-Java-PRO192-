/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package isprime;

import java.util.Scanner;

/**
 *
 * @author nkiem
 */
public class IsPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Nhap();
        boolean num = isPrime(n);
        if (num == true) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " can't Prime");
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 3; i <= Math.sqrt(n); i+=2) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static int Nhap() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Your number: ");
        n = sc.nextInt();
        return n;
    }
}
