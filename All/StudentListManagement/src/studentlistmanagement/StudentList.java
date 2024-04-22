/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlistmanagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author nkiem
 */
public class StudentList {

    private ArrayList<Student> list;

    public StudentList() {
        this.list = new ArrayList<Student>();
    }

    public StudentList(ArrayList<Student> list) {
        this.list = list;
    }
//    Thêm sinh viên vào danh sách.

    public void addStudent(Student sv) {
        this.list.add(sv);
    }
//    In danh sách sinh viên ra màn hình.

    public void printStudentList() {
        for (Student student : list) {
            System.out.println(student);
            
        }
    }
//  Kiểm tra danh sách có rỗng hay không.

    public boolean studentListEmpty() {
        return this.list.isEmpty();
    }
//  Lấy ra số lượng sinh viên trong danh sách.

    public int numberStudent() {
        return this.list.size();
    }
//    Làm rỗng danh sách sinh viên.

    public void removeAll() {
        this.list.removeAll(list);
    }
//    Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên

    public boolean researchStudent(Student sv) {
        return this.list.contains(sv);
    }

    public boolean xoaSinhVien(Student sv) {
        return this.list.remove(sv);
    }

    public void SearchNameStudent(String name) {
        ArrayList<Student> s1 = new ArrayList<>();
        int count = 0;
        for (Student student : list) {
            if (student.getName().toLowerCase().contains(name) || student.getName().toUpperCase().contains(name) || student.getName().contains(name)) {
                s1.add(student);
                count++;
            }
        }
        if (count > 0) {
            for (Student student : s1) {
                System.out.println(student);
            }
        } else {
            System.out.println("Không tìm thấy!!");
        }
    }

    // Tìm kiếm sinh viên dựa trên mã sinh viên
    public void SearchIdStudent(String id) {
        ArrayList<Student> s = new ArrayList<>();
        for (Student student : list) {
            if (student.getId().toLowerCase().contains(id) || student.getId().toUpperCase().contains(id)) {
                s.add(student);
            }
        }
        for (Student student : s) {
            System.out.println(student);
        }
    }

    // Sắp xếp danh sách sinh viên theo GPA
    public void sortGpa() {
        Collections.sort(list);
    }
    public void ghiDuLieuXuongFile(File file) {
			try {
				OutputStream os = new FileOutputStream(file);
				ObjectOutputStream oos =new ObjectOutputStream(os);
				
				for (Student student : list) {
					oos.writeObject(student);
				}			
				oos.flush();
				oos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
   public void docDuLieuTuFile(File f) {
    try {       
        InputStream is = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(is);
        Student sv;
        while (true) {
            try {
                Object oj = ois.readObject();
                if (oj == null) {
                    break;
                }
                if (oj instanceof Student) {
                    sv = (Student) oj;
                    this.list.add(sv);
                }
            } catch (EOFException e) {
                break;
            }
        }
        ois.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
   public void deleteFileStudent(String id) {
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId().equals(id)) {
                iterator.remove();
                break;
            }
        }
        File file = new File("data\\" + id + ".txt");
        if (file.exists() && file.delete()) {
        } else {
            System.out.println("Failed to delete file " + id + ".txt.");
        }
    }
    
}
  




