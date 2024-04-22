
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sonnt
 */
public class Teacher extends BaseEntity implements DataEntry {
    private String name;
    private int expyear;

    public int getExpyear() {
        return expyear;
    }

    public void setExpyear(int expyear) {
        this.expyear = expyear;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
