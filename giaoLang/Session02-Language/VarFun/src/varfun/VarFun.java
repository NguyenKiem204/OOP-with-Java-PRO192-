/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package varfun;

import java.util.Locale;

/**
 *
 * @author nkiem
 */
public class VarFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // playWithVariables();
      // playWithIntegers();
      // playWithDoubles();
      // playWithCharacters();
      //playWithBooleans();
      //playWithIntegerList();
      
    }
    public static void playWithIntegerList(){
        System.out.println("The list of 100 first integers: ");
        for (int i = 1; i <= 100; i++) {
           // System.out.printf("%d ", i );
            System.out.print(i + " ");
            
        }
    }
    public static void playWithBooleans(){
    // C: đúng 1, > 0; sai 0 int
    // Java: đúng: True, sai: false, --> boolean
    boolean marriedStatus = false;
    if(marriedStatus == true)
            System.out.println("Đánh đồn có địch mới vui");
    else
            System.out.println("Vườn hồng có lối nhưng chưa ai vào");
            
    }
    public static void playWithCharacters(){
    char m = '$';
        System.out.println("unit: " + m);
    
        String name = "Nguyễn Văn Kiểm"; // loại data type mới hoàn toàn
                                           // phức tạp  do gom n thứ khác
                                           // object data type
                                           
        System.out.println("My name is: " + name );
        System.out.println("1st letter of my name: " + name.charAt(0) );
        System.out.println("My name is a uppercase: " + name.toUpperCase() );
        
    
    }
    public static void playWithDoubles(){         // Java ưu tiên double hơn float
        double pi = 3.14;     
        System.out.println("pi: " + pi);
        System.out.printf("pi: %.2f\n", pi);// cấm tuyệt đối không dùng %lf
        
        float vat = 0.1F;
        System.out.println("vat: " + vat);
        // type nhor có thế nhét vào lớn chứ type dữ liệu lớn hơn
        // không thể nhét được vào nhỏ 
    }
    public static void playWithIntegers(){
    int n = 39;// mọi con số xuất hiện trong code đuoc gọi là literal value
    System.out.println("n: " + n);
        
    long m = 3000000000L;// phân cách literal trong code cho dễ đọc
    System.out.println("m: "+ m);
    
    int status = 0xFA;// Hệ 16
        System.out.println("status: "+ status);
        
    int phone  = 010; // 0 đầu là hệ 8 octal
        System.out.println("phone: " + phone);
    }
    public static void playWithVariables(){
    // biến là một vùng ram được đặt tên, chiếm một số bye nhất định
    int age = 20;
    int a = 10, b;
    b = 100;
    // tốn 12 byte trong RAM
        System.out.println("age: " + age);
        int yob = 2001; 
        age = 2021 - yob;
        
        System.out.println("age again: " + age);
        
        System.out.println("age by using: " + (2021 - yob));
        
        System.out.printf("age printed by using %% as in C: %d\n", (2021 - yob));
    }
}
