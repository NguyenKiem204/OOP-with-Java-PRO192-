
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
public class DemoFileOutputStream {
    public static void main(String[] args)
    {
        FileOutputStream fos = null;
        try {
            String message = "I love sonnt very much";
            byte[] bytes = message.getBytes();
            fos = new FileOutputStream("son.dat", true);
            fos.write(bytes);
            System.out.println("Done");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoFileOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DemoFileOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoFileOutputStream.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
