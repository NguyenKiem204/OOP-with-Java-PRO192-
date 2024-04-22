
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class MyPen implements IPen{
    
    public static boolean check_two_A(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'A'){
                count++;
            }
            if(count == 2){
                return true;               
            }
        }
        return false;
    }
    
    @Override
    public int f1(List<Pen> t) {
        int count = 0;
        for(Pen x : t){
            if(check_two_A(x.getName())){
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Pen> t) {
        int min_price = Integer.MAX_VALUE;
        for(Pen x : t){
            if(x.getPrice() < min_price && x.getPrice() % 2 != 0){
                min_price = x.getPrice();
            }
        }
        int index_min_first = 0;
        for(int i = 0; i < t.size(); i++){
            if(t.get(i).getPrice() == min_price){
                index_min_first = i;
                break;
            }
        }
        t.remove(index_min_first);
    }

    @Override
    public void f3(List<Pen> t) {
        Collections.sort(t.subList(2, 7), new Comparator<Pen>(){
            @Override
            public int compare(Pen o1, Pen o2) {
                if(o1.getName().equals(o2.getName())){
                    return -Integer.compare(o1.getPrice(), o2.getPrice());
                }else{
                    return o1.getName().compareTo(o2.getName());
                }
            }
            
        });
    }
    
}
