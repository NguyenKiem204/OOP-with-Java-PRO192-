/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstclass;

import java.util.Scanner;

/**
 *
 * @author nkiem
 */
public class FirstClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("So luong hoc sinh: ");
        n = sc.nextInt();
        System.out.println("");
        Scanner sc1 = new Scanner(System.in);
        Student[] s = new Student[n];
        for (int i = 0; i < s.length; i++) {
           System.out.printf("Name Student[%d]: ", i+1);
           String name = sc1.nextLine();
           System.out.println("");
           System.out.printf("id Student[%d]: ", i+1);
           int id = sc.nextInt();
           System.out.printf("\nDate of bth Student[%d]: ", i+1);
           int dob = sc.nextInt();  
            s[i] = new Student(id, name, dob);
           
           
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = i+1; j <s.length ; j++) {
                 if(s[i].name.compareTo(s[j].name)>0){
                     Student temp = s[i];
                     s[i] = s[j];
                     s[j] = temp;
            }   
                
            }
        }
        /* for (Student item : s) {
        item.print();
        }*/
        for (Student item : s) {
            System.out.println("Name: " + item.name + " || id: " + item.id + " || dob" + item.dob);
        }
    }
    
}
