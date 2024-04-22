/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class Student implements Comparable<Student>{
    public String id;
    public String name;
    public double gpa;

    public Student() {
    }

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

       @Override
    public int compareTo(Student o) {
        int nameCompare = this.name.compareTo(o.name);
        if(nameCompare == 0){
            return Double.compare(this.gpa, o.gpa);
        }
        return nameCompare;
    }
    
}
