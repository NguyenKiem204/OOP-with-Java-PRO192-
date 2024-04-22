import java.util.List;

/**
 *
 * @author nkiem
 */
public class MyCoffee implements ICoffee {

    @Override
    public int f1(List<Coffee> t) {
        int count = 0;
        for (Coffee coffee : t) {
            if (!(coffee.getName().contains("A") && coffee.getName().contains("B"))) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Coffee> t) {
        int max = -99999;
        for (Coffee coffee : t) {
            if (coffee.getSize() > max) {
                max = coffee.getSize();
            }
        }
        for (Coffee coffee : t) {
            if (coffee.getSize() == max) {
                t.remove(coffee);
                break;
            }

        }

    }

    @Override
    public void f3(List<Coffee> t) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (t.get(i).getSize() % 10 > t.get(j).getSize() % 10) {
                    Coffee temp = t.get(i);
                    t.set(i, t.get(j));
                    t.set(j, temp);
                }
            }
        }
    }
}
