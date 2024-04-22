/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// package2
package package2;

import newpackage.X;


public class Y extends X {
    public static void main(String[] args) {
        Y obj1 = new Y();
        Y obj2 = new Y();

        // Có thể gọi fun() trên chính nó
        obj1.fun(); // Output: Method fun() in class X

        // Không thể gọi fun() trên một thể hiện khác của Y
        obj2.fun(); // Lỗi biên dịch
       
        
    }
}