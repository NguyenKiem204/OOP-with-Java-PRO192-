/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoabtract;

/**
 *
 * @author nkiem
 */
public class Diem extends Hinh{

    public Diem(ToaDo toaDo) {
        super(toaDo);
    }

    @Override
    public double tinhDienTich() {
		return 1;
	}
    
}
