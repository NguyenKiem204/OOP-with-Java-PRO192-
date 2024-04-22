
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nkiem
 */
public class viduPriorityQueue {

    public static void main(String[] args) {
        Queue<String> dssv = new PriorityQueue<>();
        dssv.offer("Nguyen Van B");
        dssv.offer("Nguyen Van A");
        dssv.offer("Kiem2");
        dssv.offer("Kiem1");
        while (!dssv.isEmpty()) {
            System.out.println(dssv.poll());
        }

    }
}
