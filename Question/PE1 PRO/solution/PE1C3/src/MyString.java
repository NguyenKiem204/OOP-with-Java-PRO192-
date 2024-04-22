/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PHAM KHAC VINH
 */
public class MyString implements IString {

    @Override
    public int f1(String str) {
        //tach tat ca word ra
        String[] array = str.split("\\s+");
        int count = 0;
        for (String string : array) {
            if (check(string)) {
                count++;
            }
        }
        return count;
    }

    public boolean check(String string) {
        //tach thanh nhung ki tu rieng biet
        char[] arrayChar = string.toCharArray();
        for (char character : arrayChar) {
            //kiem tra xem character co phai la so hay ko da
            if (Character.isDigit(character)) {
                //kiem tra xem no co phai so chan hay ko
                //convert char sang kieu du lieu int
                int value = (int) character;
                if (value % 2 == 0) {
                    return true;
                }

            }
        }
        return false;

    }

    @Override
    public String f2(String str) {
         //tach tat ca word ra
        String[] array = str.split("\\s+");
        
        boolean isHas = false;
//        String found = null;
         String result = "";
        for (int i = 0; i < array.length; i++) {
            if (isPalindrome(array[i])) {
//                found = array[i];
                isHas = true;
                array[i] = "YY";
                break;
            }
        }
        if (isHas) {
//            str = str.replaceFirst(found, "YY");
            for (String string : array) {
                result += (string + " ");
            }
            result = result.trim();
            return result;
        }
        return str;
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
