/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class MyString implements IString {

    public static boolean checkStringPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }

    public static boolean checkLength(String s) {
        return s.length() >= 2;
    }

    @Override
    public int f1(String str) {
        String ArraySaveWords[] = str.split("\\s+");
        int countPalindrome = 0;
        for(String s : ArraySaveWords){
            if(checkLength(s) && checkStringPalindrome(s)){
                countPalindrome++;
            }
        }
        return countPalindrome;
    }

    @Override
    public String f2(String str) {
        int lengthOfStringMax = 0;
        String ArraySaveWords[] = str.split("\\s+");
        for(String x : ArraySaveWords){
            if(x.length() > lengthOfStringMax){
                lengthOfStringMax = x.length();
            }
        }
        String firstWordHaveLogestLength = "";
        for(String string : ArraySaveWords){
            if(string.length() == lengthOfStringMax){
                firstWordHaveLogestLength = string;
                break;
            }
        }
        return firstWordHaveLogestLength;
    }

}
