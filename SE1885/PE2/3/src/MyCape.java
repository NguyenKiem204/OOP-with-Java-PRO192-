import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class MyCape implements ICape {

    @Override
    public int f1(List<Cape> t) {
        /*int count = 0;
        float avercolor = getAverageColor(t);
        for (Cape cape : t) {
            if (cape.getColor() > ((int) avercolor)) {
                count++;
            }
            
            

        }
        return count;
        */
        int count = 0;
        int sum = 0;
        for(int i = 0; i< t.size();i++)
        {
            sum +=t.get(i).getColor();
        }
        float avg  = sum / t.size();
        for (int i = 0; i < t.size(); i++){
            if(t.get(i).getColor() > (int)avg)
                count++;
        }
        return count;

    }

    @Override
    public void f2(List<Cape> t) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i< t.size();i++)
        {
            sum +=t.get(i).getColor();
        }
        float avg  = sum / t.size();
        for (int i = 0; i < t.size(); i++)
        {
            if(t.get(i).getColor() > avg)
            {
                t.remove(i);
                break;
            }
    }
    }

    @Override
    public void f3(List<Cape> t) {
        Comparator<Cape> comparator = new Comparator<Cape>() {
            @Override
            // so sanh theo chieu giam dan
            //neu muon so sanh theo chieu tang dan thi dao nguoc t va t1, n va n1
            public int compare(Cape t, Cape t1) {
                int n = t.getTailor().length();
                int n1 = t1.getTailor().length();
                return t.getTailor().substring(n-1, n).compareTo(t1.getTailor().substring(n1-1,n1));
            }
        };
        Collections.sort(t, comparator);
    }
    
    private float getAverageColor(List<Cape> t) {
        int sum = 0;
        for (Cape cape : t) {
            sum += cape.getColor();

        }
        return ((float) sum) / t.size();

    }

}