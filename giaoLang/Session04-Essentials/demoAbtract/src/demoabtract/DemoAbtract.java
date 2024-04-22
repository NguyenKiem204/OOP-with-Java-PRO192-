/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demoabtract;

/**
 *
 * @author nkiem
 */
public class DemoAbtract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(5, 5);
		ToaDo td2 = new ToaDo(7, 9);
		ToaDo td3 = new ToaDo(12, 1);
		
//		Hinh h = new Hinh(td1); => lỗi biên dịch
		
		Hinh h1 = new Diem(td1);
		
		Hinh h2 = new HinhTron(td2, 10);
		
		Hinh h3 = new HinhChuNhat(td3, 5, 10);
		
		System.out.println("DT1: "+h1.tinhDienTich());
		System.out.println("DT2: "+h2.tinhDienTich());
		System.out.println("DT3: "+h3.tinhDienTich());
    }
    
}
