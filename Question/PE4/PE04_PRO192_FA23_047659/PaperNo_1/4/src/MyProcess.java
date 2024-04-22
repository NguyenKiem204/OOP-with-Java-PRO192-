/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class MyProcess implements IProcess{

    @Override
    public String getReverseString(String string) {
        StringBuilder s = new StringBuilder(string);
        return s.reverse().toString();
    }

    @Override
    public int countDigitsInString(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if(Character.isDigit(string.charAt(i))){
            count++;
            }
        }
     return count;
    }
    
}
