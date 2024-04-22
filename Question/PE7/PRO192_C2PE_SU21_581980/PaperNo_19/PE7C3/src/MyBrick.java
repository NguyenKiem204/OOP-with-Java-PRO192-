
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
public class MyBrick implements IBrick {

    @Override
    public int f1(List<Brick> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).getPlace().length(); j++) {
                if (Character.isDigit(list.get(i).getPlace().charAt(0)) && Character.isLetter(list.get(i).getPlace().charAt(list.get(i).getPlace().length() - 1))) {
                    count++;
                    break;
                }

            }
        }
        return count;
    }

    @Override
    public void f2(List<Brick> list) {
        int max = Integer.MIN_VALUE;
        for (Brick brick : list) {
            if (brick.getPrice() > max && brick.getPrice() % 2 != 0) {
                max = brick.getPrice();
            }
        }
        for (Brick brick : list) {
            if (brick.getPrice() == max) {
                brick.setPlace("XX");
                break;
            }
        }
    }

    @Override
    public void f3(List<Brick> list) {
        int max = Integer.MIN_VALUE;
        for (Brick brick : list) {
            if (brick.getPrice() > max && brick.getPrice() % 2 != 0) {
                max = brick.getPrice();
            }
        }
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() == max) {
                index = i;
                break;
            }

        }
        Collections.sort(list.subList(0, index), new Comparator<Brick>() {
            @Override
            public int compare(Brick o1, Brick o2) {  
                return Integer.compare(o1.getPrice(),o2.getPrice());
            }
        });
    }

}
