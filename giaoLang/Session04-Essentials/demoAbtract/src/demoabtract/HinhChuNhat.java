/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoabtract;

/**
 *
 * @author nkiem
 */
public class HinhChuNhat extends Hinh {
    private  double chieuRong;
    private  double chieuCao;

	public HinhChuNhat(ToaDo toaDo, double chieuRong, double chieuCao) {
		super(toaDo);
		this.chieuRong = chieuRong;
		this.chieuCao = chieuCao;
	}

	@Override
	public double tinhDienTich() {
		return this.chieuRong*this.chieuCao;
	}
}
