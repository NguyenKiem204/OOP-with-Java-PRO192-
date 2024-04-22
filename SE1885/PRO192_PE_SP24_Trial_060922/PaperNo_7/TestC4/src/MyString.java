/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class MyString implements IString{

    @Override
    public int f1(String str) {
    int count = 0;
    String[] s = str.split(" ");
    for (int i = 0; i < s.length; i++) {
        int count1 = 0;
        for (int j = 0; j < s[i].length(); j++) {
            if (Character.isDigit(s[i].charAt(j)) && (s[i].charAt(j) - '0') % 2 == 0) {
                count1++;
            }
            if (count1 >= 2) {
                count++;
                break;
            }
        }
    }
    return count;
}

    @Override
    public String f2(String str) {
    String s[] = str.split(" ");
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (String string : s) {
        if (string.length() < min) {
            min = string.length();
        }
        if (string.length() > max) {
            max = string.length();
        }
    }
    for (int i = 0; i < s.length; i++) {
        if (s[i].length() == max) {
            s[i] = String.valueOf(min);
            break;
        }
    }
    String result = "";
    for (String string : s) {
        result = result.concat(" " + string);
    }
    return result.trim();
}



}
