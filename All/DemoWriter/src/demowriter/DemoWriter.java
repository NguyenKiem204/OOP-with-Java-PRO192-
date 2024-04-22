/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demowriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class DemoWriter {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter wr = new PrintWriter("C:\\Users\\nkiem\\OneDrive\\Documents\\Courses\\PRO192\\SE1885\\DemoWriter\\listStudent.text");
            wr.println("Xin chào, Mình là Kiểm nhé");
            Student s = new Student("Nguyễn Văn Kiểm", "HE186025", 2004, 9.5);
            wr.println(s);
            wr.flush();
            wr.close();
        }
        
    }
    

