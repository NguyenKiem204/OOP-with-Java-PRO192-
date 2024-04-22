import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author nkiem
 */
public class ProcessStudent {
    public void sortStudent(List<Student> l){
        Collections.sort(l);
    }
    public List<Student> find_by_partial_name(List<Student> l, String letter){
        ArrayList<Student> l1 = new ArrayList<>();
        for (Student student : l) {
            if(student.getName().contains(letter)){
                l1.add(student);
            }
        }
        return l1;
    }
    public List<Student> find_higher_gpa(List<Student> l, int gpa) {
        ArrayList<Student> l2 = new ArrayList<>();
        for (Student student : l) {
            if (student.getGpa() > gpa) {
                l2.add(student);
            }
        }
        return l2;
    }
}
