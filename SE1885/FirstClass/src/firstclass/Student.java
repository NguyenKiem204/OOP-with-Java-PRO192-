/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstclass;

/**
 *
 * @author nkiem
 */
public class Student {
    public int id;
    public String name;
    public int dob;
    public Student(int id, String name, int dob){
        this.id = id;
        this.name = name;
        this.dob = dob;
    }
    public void print(){
        System.out.printf("Name: %s  || id: %d  || dob: %d\n",name, id, dob);
    }
}
