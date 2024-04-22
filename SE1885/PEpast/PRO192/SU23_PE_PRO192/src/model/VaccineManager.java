package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.Validation;

public class VaccineManager {
    private ArrayList<Vaccine> vaccines;
    String path;
    Validation val = new Validation();

    public VaccineManager() {
        vaccines = new ArrayList<>();
        path = Paths.get("").toAbsolutePath().toString();
        loadData(path + "/src/model/vaccines_input.txt");
    }

//------------------------------------------------
    public void loadData(String fName) {
        String vac = "";
        try ( FileReader f = new FileReader(fName);  BufferedReader br = new BufferedReader(f)) {
            while ((vac = br.readLine()) != null) {
                String[] b = vac.split(",");
                String code = b[0].split("=")[1];
                String name = b[1].split("=")[1];
                Integer quantity = val.checkInt(b[2].split("=")[1]);
                Date ex = val.checkValidDate(b[3].split("=")[1]);
                Double price = val.checkDouble(b[4].split("=")[1]);
                Date last = val.checkValidDate(b[5].split("=")[1]);

                if ((quantity != null) && (ex != null) && (price != null) && (last != null)) {
                    vaccines.add(new Vaccine(name, code, quantity, ex, price, last));
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(VaccineManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
//------------------------------------------------

    public ArrayList<Vaccine> search(Predicate<Vaccine> p) {
        ArrayList<Vaccine> rs = new ArrayList<>();
        for (Vaccine b : vaccines) {
            if (p.test(b)) {
                rs.add(b);
            }
        }
        return rs;
    }
//------------------------------------------------

    public void sort(Comparator<Vaccine> c) {
        Collections.sort(vaccines, c);
    }
//------------------------------------------------    

    public ArrayList<Vaccine> getVaccines() {
        return vaccines;
    }
//------------------------------------------------

    public void setVaccines(ArrayList<Vaccine> vaccines) {
        this.vaccines = vaccines;
    }
//------------------------------------------------

    public static void display(ArrayList<Vaccine> ls) {
        System.out.println("List of Vaccines\n------------------------");

        for (Vaccine b : ls) {
            System.out.println(b);
        }
        System.out.println("-------------------------");
        System.out.println("Total : " + ls.size() + " vaccines.");
    }
    //------------------------------------------------
    
    public void add() {
        String code;
        while (true) {
            code = val.getValue("Enter code: ");
            if (val.codeExist(code, vaccines)) {
                System.out.println("Code exist, enter again");
                continue;
            }
            break;
        }
        
        String name = val.getValue("Enter name: ");
        Integer quantity = val.getInt("Enter quantity: ", 1, Integer.MAX_VALUE);
        String ex;
        Date dEx;
        while (true) {
            ex = val.getValue("Enter expiration date: ");
            if (val.checkValidDate(ex) == null) {
                System.out.println("Wrong format");
                continue;
            }
            dEx = val.checkValidDate(ex);
            break;
        }
        
        Double price = val.getDouble("Enter price: ", 1, Double.MAX_VALUE);
        String last;
        Date dLast;
        while (true) {
            last = val.getValue("Enter last injected date: ");
            if (val.checkValidDate(last) == null) {
                System.out.println("Wrong format");
                continue;
            }
            dLast = val.checkValidDate(last);
            break;
        }
        
        vaccines.add(new Vaccine(name, code, quantity, dEx, price, dLast));
        System.out.println("Add successfully");
    }
    
    public void delete() {
        String delCode = val.getValue("Enter code to delete: ");
        for (Vaccine b : vaccines) {
            if (b.getCode().equals(delCode)) {
                vaccines.remove(b);
                System.out.println("Delete successfully");
                return;
            }
        }
        
        System.out.println("Code not exist");
    }
    
    public void saveToFile(String fName) {
        try (FileWriter fw = new FileWriter(fName)) {
            for (Vaccine b : vaccines) {
                fw.write(b.toString());
                fw.write("\n");
            }
            System.out.println("Write to file success");
        } catch (IOException ex) {
            Logger.getLogger(VaccineManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
