
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
public class DemoReadingFile {
    public static void main(String[] args)
    {
        FileInputStream fis = null;
        try {
            String message = "";
            fis = new FileInputStream("son.dat");
            int input = fis.read();
            while(input != -1)
            {
                message+=(char)input;
                input = fis.read();
            }
            System.out.println(message);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoReadingFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DemoReadingFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoReadingFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        BufferedReader fr = null;
        try {
            fr = new BufferedReader(new FileReader("son.dat"));
            String input = fr.readLine();
            while(input != null)
            {
                System.out.println(input);
                input = fr.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoReadingFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DemoReadingFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoReadingFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                    
        
        
        
    }
}
