
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class MyTaxi implements ITaxi {
    
    public static boolean checkStringPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
    
    public static boolean checkLength(String s) {
        return s.length() >= 2;
    }
    
    public static boolean checkTwoEvenDigitsInSalary(int salary) {
        String salaryToString = salary + "";
        int countNumberIsDigit = 0;
        for (int i = 0; i < salaryToString.length(); i++) {
            if (Integer.parseInt(salaryToString.charAt(i) + "") % 2 == 0) {
                countNumberIsDigit++;
            }
        }
        return countNumberIsDigit == 2;
    }
    
    @Override
    public int f1(List<Taxi> t) {
        int totalNumberOfSalary = 0;
        for (Taxi taxi : t) {
            if (!checkStringPalindrome(taxi.getDriver()) && checkLength(taxi.getDriver())) {
                totalNumberOfSalary += taxi.getSalary();
            }
        }
        return totalNumberOfSalary;
    }
    
    @Override
    public void f2(List<Taxi> t) {
        int indexRemoveElement = -1;
        boolean checkIndexElementExits = false;
        for (int i = 0; i < t.size(); i++) {
            if (checkTwoEvenDigitsInSalary(t.get(i).getSalary())) {
                indexRemoveElement = i;
                checkIndexElementExits = true;
                break;
            }
        }
        if (checkIndexElementExits) {
            t.remove(indexRemoveElement);
        }
    }
    
    @Override
    public void f3(List<Taxi> t) {
        Collections.sort(t, (Taxi o1, Taxi o2) -> {
            if (o1.getSalary() != o2.getSalary()) {
                return -Integer.compare(o1.getSalary(), o2.getSalary());
            } else {
                return o1.getDriver().compareTo(o2.getDriver());
            }
        });
    }
    
}
