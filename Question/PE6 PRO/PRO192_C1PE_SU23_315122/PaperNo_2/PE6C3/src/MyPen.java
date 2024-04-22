
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nkiem
 */
public class MyPen implements IPen {

    public boolean check(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                count++;
            }
            if (count == 2) {
                return true;
            }

        }
        return false;
    }

    @Override
    public int f1(List<Pen> list) {

        int countTotal = 0;
        for (Pen pen : list) {
            int count = 0;
            for (int i = 0; i < pen.getName().length(); i++) {
                if (pen.getName().charAt(i) == 'A') {
                    count++;
                }
                if (count == 2) {
                    countTotal++;
                    break;
                }

            }

        }
        return countTotal;
//        int count = 0;
//        for (Pen pen : list) {
//            if (check(pen.getName())) {
//                count++;
//            }
//        }
//        return count;
//
  }

    @Override
    public void f2(List<Pen> list) {
        int min = Integer.MAX_VALUE;
        for (Pen pen : list) {
            if(pen.getPrice()< min && pen.getPrice()%2!=0){
                min = pen.getPrice();
            }
        }
        for (Pen pen : list) {
            if(pen.getPrice() == min){
                list.remove(pen);
                break;
            }
        }
        
        
    }

    @Override
    public void f3(List<Pen> list) {
        Collections.sort(list.subList(2, 7), new Comparator<Pen>() {
            @Override
            public int compare(Pen o1, Pen o2) {
                if(o1.getName().equals(o2.getName())){
                    return Integer.compare(o2.getPrice(), o1.getPrice());
                }else{
                    return o1.getName().compareTo(o2.getName());
                }
            }
            
        });
            
        }
    }

