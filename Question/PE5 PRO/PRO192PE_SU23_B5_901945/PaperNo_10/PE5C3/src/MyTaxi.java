
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
public class MyTaxi implements ITaxi{

    @Override
    public int f1(List<Taxi> list) {
        int total = 0;
        for (Taxi taxi : list) {
            StringBuffer s = new StringBuffer(taxi.getDriver());
            if((!taxi.getDriver().equalsIgnoreCase(s.reverse().toString()))&&taxi.getDriver().length()>=2){
                total = total+taxi.getSalary();
            }
        }
        return total;
    }

    @Override
    public void f2(List<Taxi> list) {
        for (Taxi taxi : list) {
            if((taxi.getSalary()%10)%2==0 && (taxi.getSalary()/10)%2 == 0 && (taxi.getSalary()/10) > 0){
                list.remove(taxi);
                break;
            }
        }
    }

    @Override
    public void f3(List<Taxi> list) {
        Collections.sort(list);
    }
    
}
