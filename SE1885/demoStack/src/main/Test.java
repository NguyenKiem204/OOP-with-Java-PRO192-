package main;

import java.util.Scanner;
import java.util.Stack;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stackChuoi = new Stack<String>();

        // stackChuoi.push("giatri") => đưa giá trị vào stack
        // stackChuoi.pop() => lấy giá trị ra, xóa khỏi stack
        // stackChuoi.peek() => lấy giá trị ra, nhưng không xóa khỏi stack
        // stackChuoi.clear(); => xóa tất cả phần tử trong stack
        // stackChuoi.contains("giatri")=> xác định giá trị có tồn tại trong stack hay không
        // stackChuoi.size() => độ lớn của stack
        // Ví dụ đảo ngược chuỗi
        System.out.print("Nhập vào chuỗi: ");
        String s = sc.nextLine();
       
        for (int i = 0; i < s.length(); i++) {
            stackChuoi.push(s.charAt(i)+ "");
            
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stackChuoi.pop());
        }
        System.out.println("");
            Stack stackSoDu = new Stack();
            System.out.print("Nhập 1 số nguyên dương từ bàn phím: ");
            int x = sc.nextInt();
            
            while (x > 0) {
                int soDu = x % 2;
                stackSoDu.push(soDu + "");
                x = x / 2;
            }
            System.out.print("Số nhị phân là:");
            int n = stackSoDu.size();
            for ( int i = 0; i < n; i++) {
                System.out.print(stackSoDu.pop());
            }
            System.out.println("");
        }
   
}

    