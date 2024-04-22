
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class main {

    
    public static void main(String[] args) {
        System.out.print("Nhập a = ");
        int a = Nhap(); 
        System.out.printf("\nNhập b = ");
        int b = Nhap();
        System.out.print("\nNhập c = ");
        int c = Nhap();
        double  d = (double)b*b -4*a*c; 
        phuongTrinh(a, b, c, c);
    }
    public static void phuongTrinh(int a, int b, int c, int d){
           if(d<0) System.out.println("Phương trình vô nghiệm");
             else if(d == 0){
        System.out.println("Phương trình có nghiệm duy nhất x = " + -b/2*a );
                    }else {
                          System.out.print("Phương trình có 2 nghiệm phân biệt là: x1 = " + (-b + Math.sqrt(d)/2*a));
                          System.out.println(", x2 = " + (-b - Math.sqrt(d)/2*a));
                          }
        
    }
    public static int Nhap(){
        int n;
        Scanner keyBoard = new  Scanner(System.in);
        n = keyBoard.nextInt();
        return n;
      }
}
