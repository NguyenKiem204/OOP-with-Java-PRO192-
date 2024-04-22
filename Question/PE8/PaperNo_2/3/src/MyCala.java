import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author nkiem
 */
public class MyCala implements ICala{

    @Override
    public int f1(List<Cala> list) {
        int count = 0;
        for (Cala cala : list) {
            for (int i = 0; i < cala.getOwner().length(); i++) {
               if(Character.isDigit(cala.getOwner().charAt(1))){
                   count++;
                   break;
               }
                
            }
           
        }
        return count;
    }

    @Override
    public void f2(List<Cala> list) {
        int max = Integer.MIN_VALUE;
        for (Cala cala : list) {
            if(cala.getPrice()> max){
                max = cala.getPrice();
            }
        }
        int pos = 0;
        for (Cala cala : list) {
            if(cala.getPrice() == max){
                pos++;
                if(pos == 2){
                    list.remove(cala);
                    break;
                }
            }
        }
    }



    @Override
    public void f3(List<Cala> list) {
       Collections.sort(list, new Comparator<Cala>() {
            @Override
            public int compare(Cala o1, Cala o2) {
               return String.valueOf(o1.getOwner().charAt(1)).compareTo(String.valueOf(o2.getOwner().charAt(1)));
            }
        });
    }



}
