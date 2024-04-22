/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class MyString implements IString {

    @Override
    public int f1(String str) {
        int sum = 0;
        for(int i = 0; i < str.length() ; i++)
        {
            
            if(Character.isDigit(str.charAt(i)))
            {
                int numb = Integer.parseInt(str.substring(i,i+1));
                if(numb % 2 != 0)
                {
                        sum += numb;

                }
                   
            }
        }
        return sum;
        
    }

    @Override
    // tach ra tung phan tu
    // kiem tra xem string nao dai nhat + luu vi tri
    public String f2(String str) {
     String[]s = str.split("\\s");
     int max = 0;
     int pos = 0;
     for(int i = 0; i < s.length; i++){
         if(max < s[i].length())
         {
             max = s[i].length();
             pos = i;
         }
     }
     //ghep cac chuoi vao voi nhau 
     String output = "";
     for(int i = 0; i < s.length; i++)
     {
         if(i != pos)
         {
             output += s[i] + " ";
         }
     }
        output += s[pos];
        return output.trim();
    }
    
}
