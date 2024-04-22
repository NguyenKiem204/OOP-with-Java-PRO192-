/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maytinhbotui;

import maytinh1.MayTinhBoTuiInterface;
import maytinh1.MayTinhCasioFX580;
import maytinh1.MayTinhVinacal570;
import maytinh1.PhanMemMayTinh;
import maytinh1.SapXepChen;
import maytinh1.SapXepChon;

/**
 *
 * @author nkiem
 */
public class main {
    public static void main(String[] args) {
        System.out.println("Test Câu a");
        MayTinhBoTuiInterface mfx580 = new MayTinhCasioFX580();
        MayTinhVinacal570 mvn570 = new MayTinhVinacal570();
        System.out.println("5+3= " + mfx580.cong(5, 3));
        System.out.println("4*5 = "+ mvn570.nhan(4, 5));
        System.out.println("4/0 = " + mvn570.chia(4, 0));
        System.out.println("Test Câu b");
        double arr[] = new double[]{4, 5, 8, 3, 9, 1, 2};
        double arr1[] = new double[]{6, 2, 5, 4, 8, 9, 1, 7};
        SapXepChen S1 = new SapXepChen();
        SapXepChon S2 = new SapXepChon();
        
        S1.sapxepgiam(arr);
        S2.sapxeptang(arr1);
        System.out.println("Mang thu nhat");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");       
        }
        System.out.println("");
        System.out.println("Mang thu 2: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");       
        }
        System.out.println("");
        System.out.println("Test Câu C");
        PhanMemMayTinh S3  = new PhanMemMayTinh();
        System.out.println("50*17 = " + S3.nhan(50, 17));
        double arr2[] = new double[]{4, 5, 3, 7, 6, 9, 8, 2, 1};
        S3.sapxeptang(arr2);
        System.out.println("Mang thu 3");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");       
        }
        System.out.println("");
    }
}
