
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.print.DocFlavor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PHAM KHAC VINH
 */
public class MyCala implements ICala {

    @Override
    public int f1(List<Cala> t) {
        int count = 0;
        //lap qua tat ca phan tu trng list t
        for (Cala cala : t) {
            //kiem tra xem price co phai la even number
            if (cala.getPrice() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Cala> t) {
        //tim ra phan tu be nhat
        Cala minumum = t.get(0);
        for (Cala cala : t) {
            if (cala.getPrice() < minumum.getPrice()) {
                minumum = cala;
            }
        }

        //tim ra phan tu thu 2 be nhat
        int count = 0;
        Cala secondMinumum = null;
        for (Cala cala : t) {
            if (cala.getPrice() == minumum.getPrice()) {
                count++;
            }
            if (count == 2) {
                secondMinumum = cala;
                break;
            }
        }

        if (secondMinumum != null) {
            t.remove(secondMinumum);
        }

    }

    @Override
    public void f3(List<Cala> t) {
        Collections.sort(t, new Comparator<Cala>() {
            @Override
            public int compare(Cala o1, Cala o2) {
                String firstOfO1 = String.valueOf(o1.getOwner().charAt(0));
                String firstOfO2 = o2.getOwner().substring(0,1);
                return firstOfO2.compareTo(firstOfO1);
            }
        });
    }

}
