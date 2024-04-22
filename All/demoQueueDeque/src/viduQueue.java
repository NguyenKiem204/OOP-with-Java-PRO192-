
import java.util.LinkedList;
import java.util.Queue;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class viduQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<String> dssv = new LinkedList<>();
        dssv.offer("KiemNV");
        dssv.offer("KimCute");
        dssv.offer("KiemDtrai");
        while(true){
            String ten = dssv.poll();
            if(ten == null){
                break;
            }
            System.out.println(ten);
        }
       
    }
    
}
