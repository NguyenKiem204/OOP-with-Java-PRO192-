import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBContext<T extends BaseEntity & DataEntry> {
    protected FileInputStream fis = null;
    protected ObjectInputStream ois = null;
    
    protected FileOutputStream fos = null;
    protected ObjectOutputStream oos = null;
    
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<T> list = new ArrayList<>();

    public void add(T record) {
        insert(record);
    }
    
    public void update(T record) {
        insert(record);
    }
    
    public void remove(T record) {
        try {
            String filePath = "data\\" + record.getClass().getName() + "\\" + record.getId() + ".dat";
            Path path = Paths.get(filePath);
            Files.deleteIfExists(path);
        } catch (IOException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insert(T record) {
        try {
            fos = new FileOutputStream("data\\" + record.getClass().getName() + "\\" + record.getId() + ".dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(record);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public T read(int id, Class<T> type) {
        try {
            fis = new FileInputStream("data\\" + type.getName() + "\\" + id + ".dat");
            ois = new ObjectInputStream(fis);
            return (T) ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void printRecords() {
        if (list.isEmpty()) {
            System.out.println("No records available.");
        } else {
            System.out.println("List of Records:");
            for (T record : list) {
                System.out.println(record.toString());
            }
        }
    }

    public void sortByField(Comparator<T> comparator) {
        if (list.isEmpty()) {
            System.out.println("No records available.");
        } else {
            Collections.sort(list, comparator);
            System.out.println("List of Records sorted:");
            for (T record : list) {
                System.out.println(record.toString());
            }
        }
    }

    public void searchByField(String field, String value) {
        ArrayList<T> searchResults = new ArrayList<>();
        for (T record : list) {
            // Implement search logic based on the field and value
            if (record.toString().contains(value)) {
                searchResults.add(record);
            }
        }
        if (!searchResults.isEmpty()) {
            System.out.println("Search results:");
            for (T record : searchResults) {
                System.out.println(record.toString());
            }
        } else {
            System.out.println("No records found!");
        }
    }
}