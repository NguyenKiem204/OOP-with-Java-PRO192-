import java.io.Serializable;
/**
 *
 * @author nkiem
 */
public class Student implements Comparable<Student>, Serializable {

    private String id;
    private String name;
    private int yob;
    private double gpa;

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public Student(String id) {
        this.id = id;

    }


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYob() {
        return yob;
    }

    public double getGpa() {
        return gpa;
    }

    public String getofName() {
        String s = this.name.trim();
        if (s.indexOf(" ") > 0) {
            int index = s.lastIndexOf(" ");
            return s.substring(index + 1);
        } else {
            return s;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %-20s || Id: %-10s || Yob: %-4d || Gpa: %3.2f", this.name, this.id, this.yob, this.gpa);
    }

    @Override
    public int compareTo(Student o) {
        int a = Double.compare(o.gpa, gpa);
        if (a == 0) {
            return this.name.compareTo(o.name);
        }
        return a;
    }
}