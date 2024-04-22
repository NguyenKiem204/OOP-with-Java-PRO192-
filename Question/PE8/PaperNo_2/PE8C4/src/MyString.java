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
        int count  = 0;
        String s[] = string.split("\\s+");
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                if(Character.isDigit(s[i].charAt(j))){
                    if(s[i].charAt(j)%2!=0){
                        count++;
                    }
                }
                
            }
            
        }
        return count;
    }

    @Override
    public String f2(String string) {
        String[] s = string.split("\\s+");
        String h = "";
        for (String string1 : s) {
            String l = new StringBuffer(string1).reverse().toString();
            if(string1.equals(l)){
                 h = string.replaceFirst(string1, "XX");
                break;
            }
        }
        return h;
    }
    
}
