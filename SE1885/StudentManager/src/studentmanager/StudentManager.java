/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanager;

import java.util.Scanner;

/**
 *
 * @author nkiem
 */
public class StudentManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input();
        saveStudent();
    }
    public static void input(){
        String name, id;
        int yob;
        double gpa;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter id: ");
        id  = sc.nextLine();
        System.out.print("Enter yob: ");
        yob = sc.nextInt();
        System.out.print("Enter gpa: ");
        gpa = sc.nextDouble();
        Student s1 = new Student(id, name, yob, gpa);
        s1.showAll();
    }
    public static void saveStudent(){
        Student s3 = new Student("HE188702", "Vinh", 2003, 8.7);
        Student s2 = new Student("HE186205", "Nguyen", 2004, 8.5);
        s2.showAll();
        s3.showAll();
        System.out.println(s3.toString());
        
    }
}
