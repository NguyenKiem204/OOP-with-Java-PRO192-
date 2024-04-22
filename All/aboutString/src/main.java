
import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeString;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ten = input.nextLine();
        ten = ten.replaceAll("\\s+", " "); // xóa các dấu cách thùaư thãi
        System.out.println(ten);
        
    }
}
   
        
    
    
