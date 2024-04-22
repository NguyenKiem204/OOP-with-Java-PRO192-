
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sonnt
 */
public class DemoDeSerialization {
    public static void main(String[] args)
    {
        try {
            FileInputStream fis = new FileInputStream("1.student");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student student = (Student)ois.readObject();
            System.out.println(student.getId() + "-"+ student.getName());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoDeSerialization.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DemoDeSerialization.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DemoDeSerialization.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
