/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sonnt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input1_1 = "aaa33bbcc35";
        int countNumbers =  Main.CountNumber(input1_1);
        System.out.println(countNumbers); //PRINT CODE -->4;
        
        String input1_2 = "aaabbccdd";
        countNumbers =  Main.CountNumber(input1_2);
        System.out.println(countNumbers); //PRINT CODE -->0;
        
        
        String input2_1 = "aaa33bbcc35";
        int sumNumbers =  Main.SumNumber(input2_1);
        System.out.println(sumNumbers); //PRINT CODE -->68;
        
        String input2_2 = "aaabbcc";
        sumNumbers =  Main.SumNumber(input2_2);
        System.out.println(sumNumbers); //PRINT CODE -->0;
        
        String input2_3 = "13aaabbcc6";
        sumNumbers =  Main.SumNumber(input2_3);
        System.out.println(sumNumbers); //PRINT CODE -->19;
        
        
    }

    private static int CountNumber(String input1) {
        int count  = 0;
        for (int i = 0; i < input1.length(); i++) {
            if(Character.isDigit(input1.charAt(i))){
                count++;
            }
            
        }
        return count;
    }

   private static int SumNumber(String input2_1) {
    int sum = 0;
    StringBuilder s = new StringBuilder();

    for (char c : input2_1.toCharArray()) {
        if (Character.isDigit(c)) {
            s.append(c);
        } else {
            if (s.length() > 0) {
                sum += Integer.parseInt(s.toString());
                s.setLength(0);
            }
        }
    }

    if (s.length() > 0) {
        sum += Integer.parseInt(s.toString());
    }

    return sum;
}


    
    
}
