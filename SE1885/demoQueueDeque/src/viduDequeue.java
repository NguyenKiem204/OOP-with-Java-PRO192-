
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class viduDequeue {
    public static void main(String[] args) {
        Deque<String> dssv = new ArrayDeque<>();
        dssv.offer("NYC 2");
        dssv.offer("Nguyen Van Kiem");
        dssv.offer("Nguyen Van Hai");
        dssv.offer("NYC 3");
        dssv.offerFirst("NYC 1");
        dssv.offerLast("NYC 4");
        while(!dssv.isEmpty()){
            System.out.println(dssv.poll());
        }
    }
}
