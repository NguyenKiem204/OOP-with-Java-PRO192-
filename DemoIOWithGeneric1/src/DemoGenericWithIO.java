/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sonnt
 */
public class DemoGenericWithIO {
    public static void main(String[] args)
    {
        Student s = new Student();
        s.setId(100);
        s.setName("Test");
        DBContext db = new DBContext();
        db.insert(s);
        
        Teacher t = new Teacher();
        t.setId(101);
        t.setName("HEHEH 101");
        db.insert(t);
        
        Student student = db.read(s.getId(), Student.class);
        System.out.println(student);
        
    }
}
