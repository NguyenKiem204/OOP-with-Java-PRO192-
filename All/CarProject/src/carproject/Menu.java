package carproject;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private int response, rs;
    private Scanner sc = new Scanner(System.in);
    private String r;

    //For the menu list
    public int int_getChoice(ArrayList<String> options) {
        for (String i : options) {
            System.out.println(i);
        }
        boolean cont = false;
        do{
            try {
                System.out.print("Please choose an option 1..11: ");
                r = sc.next();
                rs = Integer.parseInt(r);
                if (rs < 0 || rs > 11) {
                    throw new Exception();
                }
                cont = false;
            } catch (Exception e) {
                System.out.println("Wrong option!");
                cont = true;
            }
        }while(cont);
        
        return rs;
    }

    //Get user choice as an integer
    public int int_getChoice(BrandList brand) {
        int n = brand.size();
        for (int i = 0; i < n; i++) {
            System.out.println("" + (i + 1) + ". " + brand.get(i));
        }
        System.out.print("Please choose an option 1..12: ");
        response = sc.nextInt();
        return response;
    }

    //Get user choice as an object in the list
    public Brand ref_getChoice(BrandList options) {
        int N = options.size();
        System.out.println("Brand ID List:");
        do {
            response = int_getChoice(options);
        } while ((response < 0) || (response > N));
        return options.get(response - 1);
    }
}
