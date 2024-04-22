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
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            if(Character.isDigit(string.charAt(i))){
                if(string.charAt(i)%2 !=0){
                    sum+=Integer.parseInt(String.valueOf(string.charAt(i)));
                }
            } 
        }
        return sum;
    }

    @Override
    public String f2(String string) {
        
        String[] s = string.split("\\s+");
        int max = Integer.MIN_VALUE;
        
        for (String str : s) {
            if(str.length()>max){
                max = str.length();
            }
        }
        String l  = "";
         for (String str : s) {
            if(str.length() == max){
                l = str;
                break;
            }
        }
        String a = "";
        for (String string1 : s) {
            if(!string1.contains(l)){
                a+=string1+" ";
            }
        }
        a = a+l;
        return a;
    }
    
}
