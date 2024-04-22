
import java.util.Collections;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class MyCape implements ICape{

    @Override
    public int f1(List<Cape> list) {
       int count = 0;
       int sum = 0;
        for (Cape cape : list) {
            sum += cape.getColor();
        }
        float averger = (float)sum/list.size();
        for (Cape cape : list) {
            if(cape.getColor()>averger)
                count++;
        }
        return count;
    }

    @Override
    public void f2(List<Cape> list) {
        int sum = 0;
        for (Cape cape : list) {
            sum += cape.getColor();
        }
        float averger = (float)sum/list.size();
        for (Cape cape : list) {
            if(cape.getColor()>averger){
                list.remove(cape);
                break;
            }
        }
    }

    @Override
    public void f3(List<Cape> list) {
        Collections.sort(list);
    }
    
}
