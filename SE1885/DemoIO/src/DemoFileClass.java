
import java.io.File;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sonnt
 */
public class DemoFileClass {

    public static void readFile(String path)
    {
        File f = new File(path);
        System.out.println(f.getAbsolutePath());
        if(f.isDirectory())
        {
            File[] files = f.listFiles();
            for (File file : files) {
                readFile(file.getAbsolutePath());
            }
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         readFile("D:\\Game-KIS");
    }
    
}
