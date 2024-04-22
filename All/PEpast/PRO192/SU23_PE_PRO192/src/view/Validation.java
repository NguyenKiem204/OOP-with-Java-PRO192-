
package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import model.Vaccine;

public class Validation {
    final static String DATE_FORMAT = "dd/mm/yyyy";

    public String getValue(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        return sc.nextLine().trim();
    }
    
    public int getInt(String msg, int min, int max) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(msg);
            try {
                int n = Integer.parseInt(sc.nextLine());
                if (min <= n && n <= max) return n;
            } catch (NumberFormatException ex) {
                System.out.println("Wrong format");
            }
        }
    }
    
    public boolean codeExist(String code, ArrayList<Vaccine> vaccines) {
        for (Vaccine b : vaccines) {
            if (b.getCode().equals(code)) {
                System.out.println("Success");
                return true;
            }
        }
        
        return false;
    }
    
    public double getDouble(String msg, double min, double max) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(msg);
            try {
                double n = Double.parseDouble(sc.nextLine());
                if (min <= n && n <= max) return n;
            } catch (NumberFormatException ex) {
                System.out.println("Wrong format");
            }
        }
    }
    
    public Integer checkInt(String msg) {
        try {
            return Integer.parseInt(msg);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid number");
            return null;
        }
    }
    
    public Double checkDouble(String msg) {
        try {
            return Double.parseDouble(msg);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid number");
            return null;
        }
    }

    public Date checkValidDate(String msg) {
        while (true) {
            try {
                return validStringToDate(msg);
            } catch (ParseException ex) {
                System.out.println(msg+"Invalid date. Date format: dd/mm/yyyy");
                return null;
            }

        }

    }

    public Date validStringToDate(String date) throws ParseException {
        DateFormat df = new SimpleDateFormat(DATE_FORMAT);
         df.setLenient(false);
        return df.parse(date);
    }

    public String showDate(Date date) {
        DateFormat df = new SimpleDateFormat(DATE_FORMAT);
        return df.format(date);
    }
    
}
