/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortrect;

import java.util.Scanner;

/**
 *
 * @author nkiem
 */
public class SortRect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("So hinh chu nhat la: ");
        n = sc.nextInt();
        Rect[] s = new Rect[n];
        for (int i = 0; i < s.length; i++) {
         System.out.print("Nhap toa do hinh " + (i+1) + " (x,y), weight, hieght: ");
         s[i] = new Rect(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
         
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = i+1; j < s.length; j++) {
                if(s[i].getPara()>s[j].getPara()){
                    Rect temp = s[i];
                         s[i] = s[j];
                         s[j] = temp;
                }
            }
            
        }
        System.out.println("Sap xep theo chu vi tu be den lon la: ");
        for (int i = 0; i < s.length; i++) {
            System.out.printf("Parameter: %d || Point: (%d, %d) || Weight: %d || Hieght: %d\n",
                   s[i].getPara(), s[i].x, s[i].y, s[i].weight, s[i].height);
        }
    }
    
}
