
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
public class DemoSerialization {
    public static void main(String[] args)
    {
        FileOutputStream fos = null;
        try {
            Student s = new Student();
            s.setId(1);
            s.setName("mr A");
            fos = new FileOutputStream(s.getId()+".student");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
                    } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoSerialization.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DemoSerialization.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoSerialization.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
