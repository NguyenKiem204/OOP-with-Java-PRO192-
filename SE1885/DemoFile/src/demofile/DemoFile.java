/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demofile;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author nkiem
 */
public class DemoFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File folder1 = new File("C:\\Users\\nkiem\\OneDrive\\Documents\\Courses\\PRO192\\SE1885\\DemoFile");
        System.out.println("Kiểm tra folder1 có tồn tại hay không: " + folder1.exists());

        // Tạo thư mục
        // Phương thức mkdir() => Tạo 1 thư mục
        File d1 = new File("C:\\Users\\nkiem\\OneDrive\\Documents\\Courses\\PRO192\\SE1885\\DemoFile\\Directory_1");
        d1.mkdir();

        // Phương thức mkdirs() => Tạo nhiều thư mục cùng 1 lúc.
        File d2 = new File("C:\\Users\\nkiem\\OneDrive\\Documents\\Courses\\PRO192\\SE1885\\DemoFile\\Directory_1\\Directory_2\\Directory_3\\Directory_4");
        d2.mkdirs();
        
        // Tạo tập tin (có phần mở rộng: .exe, .txt, .doc, xls....)
        File file1 = new File("C:\\Users\\nkiem\\OneDrive\\Documents\\Courses\\PRO192\\SE1885\\DemoFile\\Directory_1\\vidu1.txt");
        try {
            file1.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(DemoFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
