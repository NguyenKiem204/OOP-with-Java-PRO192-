/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package varfun2;

import java.util.Scanner;
// ~ #include<stdio.h>
/**
 *
 * @author nkiem
 */
public class VarFun2 {

    /**
     * @param args the command line arguments
     */
    /*Hiện tượng 1 class bất kì chứa nhiều hàm trùng tên nhưng khác thành phần
    tham số đầu vào, mà phải khác trên data type chứ không phải khác trên tên biến 
    được gọi là OVERLOAD/OVERLOADING - quá tải hàm
    */
    public static void main(String[] args) {
        int n = getApositiveInteger();
        System.out.println("Your number: " + n);
        printIntegeList(n);
    }
    public static int getApositiveInteger(){
    int n;
    // nhập từ bàn phím, xài kĩ thuật OOP,
    Scanner banPhimCuaTui = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        n = banPhimCuaTui.nextInt();
    return n;
    }
    public static void printIntegeList(int n){ 
        System.out.println("The list of " + n + " first integers");
        for (int i = 1; i <= n; i++) 
        System.out.printf("%d ", i);
        
        System.out.print("\n");
           
    }
    
}
