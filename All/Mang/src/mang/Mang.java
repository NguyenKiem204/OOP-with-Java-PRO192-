package mang;

import java.util.Arrays;
import java.util.Scanner;

public class Mang {

    public static void main(String[] args) {
        System.out.print("Nhập số lượng phần tử: ");
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int Array[] = new int[n];
        nhapMang(Array, n);
        int num;
        //System.out.print("Nhập số cần tìm: ");
        System.out.print("Số cần thêm vào là: ");// Thêm một phần tử bất kì
        Arrays.sort(Array);
        num = sc.nextInt();
        int index = findIndextoAdd(Array, n, num);
         if (index != -1) {
            Array = them1so(Array, n, num, index);
            printArray(Array, Array.length);
        } else {
            printArray(Array, n);}
     /*   int index = findIndext(Array, n, num); Xóa một phần tử bất kì
        if (index != -1) {
            Array = delete1so(Array, n, num, index);
            printArray(Array, Array.length);
        } else {
            printArray(Array, n);
        }*/
    }
    public static void nhapMang(int[] Array, int n){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }
    }
    public static void printArray(int[] Array, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.print("\n");
    }
    public static int findIndext(int Array[], int n, int num){
        for (int i = 0; i < Array.length; i++) {
            if(Array[i] == num){
                System.out.println("Vị trị của " + num + " trong mảng là: " + i);
                return i;
            }   
        }
        System.out.println("Không tồn tại: " + num);
        return -1;
    }
    public static int[] delete1so(int Array[], int n, int num, int index){
        if(index == -1){
            return Array;
        }else{
            int newArray[] = new int[Array.length - 1];
            System.arraycopy(Array, 0, newArray, 0, index);
            System.arraycopy(Array, index + 1, newArray, index, Array.length - index - 1);
            return newArray;
        }
    }
    public static int[] them1so(int Array[], int n, int num, int index){
    int newmang[] = new int[Array.length + 1];
        System.arraycopy(Array, 0, newmang, 0, index);
        newmang[index] = num;
        System.arraycopy(Array, index , newmang, index + 1, Array.length - index);
        return newmang;
}
    public static int findIndextoAdd(int Array[], int n, int num){
        if(Array[Array.length - 1] < num){
            return Array.length;
        }else if(Array[0]>num){
            return 0;
        }
        for (int i = 0; i < Array.length; i++) {
            if(Array[i] <= num && num <= Array[i+1]){
                return i+1;
            }
            
        }
        return -1;
    }
}
