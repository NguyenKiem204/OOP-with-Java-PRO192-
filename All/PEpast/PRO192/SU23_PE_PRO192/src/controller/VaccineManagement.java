
package controller;

import java.util.Scanner;
import model.VaccineManager;
import view.Menu;
import view.Validation;

public class VaccineManagement extends Menu {
    static String[] menu = {"Display All Vaccines From File", "Add a Vaccine", "Delete a Vaccine by code", "Sort Vaccines by Name", "Save to File", "Exit"};
    private VaccineManager vaccineList = new VaccineManager();
    Validation val = new Validation();

    public VaccineManagement() {
        super("Vaccine Management System", menu);
    }
//--------------------------------------------------

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                vaccineList.display(vaccineList.getVaccines());
                break;
            case 2:
                vaccineList.add();
                break;
            case 3:
                vaccineList.delete();
                break;
            case 4:
                vaccineList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
                vaccineList.display(vaccineList.getVaccines());
                break;
            case 5:
                vaccineList.saveToFile("vaccines_output.txt");
                break;
            case 6:
                System.exit(0);
        }
    }
//--------------------------------------------------

    private String getValue(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        return sc.nextLine();
    }
//--------------------------------------------------

    public static void main(String[] args) {
        VaccineManagement mgnObj = new VaccineManagement();
        mgnObj.run();
    }
        
}
