/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nkiem
 */
public class Student extends Person implements IStudy{
    private String StudentID;

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }
    
    public Student() {
    }

    @Override
    public void study(String s) {
        System.out.println(this.StudentID + " learning " + s);
    }
   
    
}
