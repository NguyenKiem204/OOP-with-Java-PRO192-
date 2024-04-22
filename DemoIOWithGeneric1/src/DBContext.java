
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.ParameterizedType;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sonnt
 * @param <T>
 * @param <DataEntry>
 */
public class DBContext {
    protected FileInputStream fis = null;
    protected ObjectInputStream ois = null;
    
    protected FileOutputStream fos = null;
    protected ObjectOutputStream oos = null;
    
    public <T extends BaseEntity & DataEntry> void insert(T record)
    {
        try {
            fos = new FileOutputStream("data\\"+record.getClass().getName()+"\\"+record.getId()+".dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(record);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public <T extends BaseEntity & DataEntry> T read(int id,Class<T> type)
    {
        try {
            fis = new FileInputStream("data\\"+type.getName()+"\\"+id+".dat");
            ois = new ObjectInputStream(fis);
            return (T)ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
