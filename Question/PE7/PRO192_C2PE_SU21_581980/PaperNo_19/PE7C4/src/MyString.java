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
        int count = 0;
        String[] s = string.split("\\s+");
        for (String string1 : s) {
            for (int i = 0; i < string1.length(); i++) {
                if (string1.charAt(string1.length() - 1) == 'm' || string1.charAt(string1.length() - 1) == 'n') {
                    count++;
                }
                break;
            }

        }
        return count;
    }

    @Override
    public String f2(String string) {
        int max = Integer.MIN_VALUE;
        String[] s = string.split("\\s+");
        for (String string1 : s) {
            if (string1.length() > max) {
                max = string1.length();
            }
        }
//        for (String string1 : s) {
//            if(string1.length()==max){
//               StringBuffer d = new StringBuffer(string1);
//               string1 = d.reverse().toString();
//                break;
//                
//            }
//        }
//        String h = "";
//        for (String string1 : s) {
//            h += string1 + " ";
//        }
//        return h;
        String h = "";
        for (String string1 : s) {
            if (string1.length() == max) {      
                StringBuffer d = new StringBuffer(string1);
                h = d.reverse().toString();
                break;

            }
        }
        int index = 0;
        for (int i = 0; i < s.length; i++) {
             if (s[i].length() == max) {      
               index = i;
                break;

            }
            
        }
        String l = "";
        for (int i = 0; i < s.length; i++) {
             if (i!=index) {      
              l += s[i]+" ";

            }else l+= h+" ";
            
        }
        return l;
    }

}
