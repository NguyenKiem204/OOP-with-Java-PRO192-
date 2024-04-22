
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nkiem
 */
public class MyString implements IString {

    @Override
    public int f1(String string) {
        String s = "AIUEOaiueo";
        String[] l = string.split(" ");
        int sum = 0;
        for (String string1 : l) {
            int count = 0;
            for (char l2 : string1.toCharArray()) {
                if (Character.isLetter(l2)&&!s.contains(String.valueOf(l2))) {
                    count++;
                }
                if (count == 2) {
                    sum++;
                    break;
                }
            }
        }
        return sum;
    }

    @Override
    public String f2(String str) { // kiem tra xem co bao nhieu ki tu xuat hien it nhat 2 lan va sap xep giam dan
        str = str.toLowerCase();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                int tanSuat = map.get(str.charAt(i));
                tanSuat++;
                map.put(str.charAt(i), tanSuat);
            } else {
                map.put(str.charAt(i), 1);
            }
        }

        ArrayList<Character> arr = new ArrayList<>();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (value > 1) {
                arr.add(key);
            }
        }
        str = "";
        Collections.sort(arr);
        Collections.reverse(arr);
        for (Character x : arr) {
            str += x;
        }
        return str;
    }
}
