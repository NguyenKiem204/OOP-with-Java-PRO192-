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
    public int f1(String string) {
        string.trim();
        String[] a  = string.split(" ");
        int count  = 0;
        for (String s : a) {
            StringBuffer sc = new StringBuffer(s);
            if(s.equals(sc.reverse().toString()) && s.length() >= 2){
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String string) {
        string.trim();
        String[] a  = string.split(" ");
        int max = Integer.MIN_VALUE;
        for (String s : a) {
            if(s.length()>max){
                max = s.length();
            }
        }
        for (String s : a) {
            if(s.length()== max){
                return s;
            }
        }
        return null;
    }
    
}
