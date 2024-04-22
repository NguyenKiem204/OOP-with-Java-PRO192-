
import model.Doctor;
import model.IStudy;
import model.Person;
import model.Student;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sonnt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DO NOT MODIFY CODE HERE
        Person p1 = new Student();
        p1.setName("Nguyen Van A");
        p1.setAge(20);
        
        Person p2 = new Doctor();
        p2.setName("Dr X");
        p2.setAge(40);
        
        Student s1 = (Student)p1;
        s1.setStudentID("HE0001");
        
        IStudy study1 = s1;
        study1.study("Math");
        
        Doctor d2 = (Doctor)p2;
        d2.setLevel(3);
        
        IStudy study2 = d2;
        study2.study("PhD");
    }
    
}
