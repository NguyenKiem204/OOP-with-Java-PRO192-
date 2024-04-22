/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sonnt
 */
public class UnderGradStudent extends Student {
    public void displayInfo()
    {
        System.out.println("ID :" + this.id);
        System.out.println("Name: "+ this.name);
        
    }
    
    public float getResult()
    {
        float avg = 0;
        for (Grade grade : this.result.grades) {
            avg+= grade.score;
        }
        avg = avg/this.result.grades.length;
        return avg;
    }
}
