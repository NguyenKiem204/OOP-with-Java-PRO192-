/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sonnt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //List of Subject
        Subject s1 = new Subject(1,"Math",3);
        Subject s2 = new Subject(2,"Literature",3);
        Subject s3 = new Subject(3,"Engligh",3);
        
        
        UnderGradStudent under = new UnderGradStudent();
        under.id = 1;
        under.name = "Mr A";
        under.displayInfo();
        
        Grade g1 = new Grade();
        g1.student = under;
        g1.subject = s1;
        g1.score = 5;
        
        Grade g2 = new Grade();
        g2.student = under;
        g2.subject = s2;
        g2.score = 4;
        
        Grade g3 = new Grade();
        g3.student = under;
        g3.subject = s3;
        g3.score = 8;
        
        under.result = new  Result();
        under.result.grades[0] = g1;
        under.result.grades[1] = g2;
        under.result.grades[2] = g3;
        
        
        System.out.println(under.getResult());
        
        
        
    }
    
}
