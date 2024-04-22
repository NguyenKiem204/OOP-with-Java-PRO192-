/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sorttriangle;

import java.util.Scanner;

/**
 *
 * @author nkiem
 */
public class SortTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.print("So luong tam giac la: ");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Triangle[] S = new Triangle[n];
        for (int i = 0; i < S.length; i++) {
           System.out.print("\nEnter Point A: (x, y) =  ");
           Point A = new Point(sc.nextInt(), sc.nextInt());
           System.out.print("\nEnter Point B: (x, y) =  ");
           Point B = new Point(sc.nextInt(), sc.nextInt());
           System.out.print("\nEnter Point C: (x, y) =  ");
           Point C = new Point(sc.nextInt(), sc.nextInt());
            S[i] = new Triangle(A, B, C);
        }
        for (int i = 0; i < S.length; i++) {
            for (int j = i+1; j < S.length; j++) {
                 if(S[i].Parameter(S[i].A, S[i].B, S[i].C) > 
                    S[j].Parameter(S[j].A, S[j].B, S[j].C)){
                     Triangle temp = S[i];
                     S[i] = S[j];
                     S[j] = temp;
                 }
            } 
        }
        System.out.println("Thu tu chu vi la: ");
        for (Triangle S1 : S) {
            System.out.printf("Chu vi: %.2f || Point A: (%d, %d) || Point B: (%d, %d)|| Point C: (%d, %d)\n", 
                    S1.Parameter(S1.A, S1.B, S1.C), S1.A.x, S1.A.y, S1.B.x, S1.B.y, S1.C.x, S1.C.y);
        }
    }
   } 

