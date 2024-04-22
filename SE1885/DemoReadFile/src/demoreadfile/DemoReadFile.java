/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demoreadfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import static java.nio.charset.StandardCharsets.UTF_8;
import java.nio.file.Files;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nkiem
 */
public class DemoReadFile {

//    public static void main(String[] args) throws IOException {
//        File f = new File("C:\\Users\\nkiem\\OneDrive\\Documents\\Courses\\PRO192\\SE1885\\DemoReadFile\\listStudent.text");
//        BufferedReader rd = Files.newBufferedReader(f.toPath(), UTF_8);
//        String line = null;
//        while(true){
//            line = rd.readLine();
//            if(line == null){
//                break;
//            }else System.out.println(line);
//        }
//    }
   // (Cach 1)
    public static void main(String[] args) {
        File f2 = new File("C:\\\\Users\\\\nkiem\\\\OneDrive\\\\Documents\\\\Courses\\\\PRO192\\\\SE1885\\\\DemoReadFile\\\\listStudent.text");
        try {
            List<String> readAll = Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
            for (String line : readAll) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(DemoReadFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
