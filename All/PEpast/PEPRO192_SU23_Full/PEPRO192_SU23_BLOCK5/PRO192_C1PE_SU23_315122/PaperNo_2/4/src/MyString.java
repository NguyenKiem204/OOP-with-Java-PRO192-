
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class MyString implements IString{
    
    public static boolean check_character_is_consonat(String s){
        String t = "AIOEUaioeu";
        if(t.contains(s)){
            return false;
        }
        return true;
    }
    
    public static boolean check_string_contains_at_least_two_consonant(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(check_character_is_consonat(s.charAt(i) + "")){
                count++;
            }
            if(count == 2){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int f1(String str) {
        StringTokenizer st = new StringTokenizer(str);
        int count = 0;
        while(st.hasMoreElements()){
            String tmp = st.nextToken();
            if(check_string_contains_at_least_two_consonant(tmp)){
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        str = str.toLowerCase();
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                int tanSuat = map.get(str.charAt(i));
                tanSuat++;
                map.put(str.charAt(i), tanSuat);
            }else{
                map.put(str.charAt(i), 1);
            }
        }
        
        ArrayList<Character> arr = new ArrayList<>();
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if(value > 1){
                arr.add(key);
            }
        }
        str = "";
        Collections.sort(arr);
        Collections.reverse(arr);
        for(Character x : arr){
            str += x;
        }
        return str;
    }
    
}
