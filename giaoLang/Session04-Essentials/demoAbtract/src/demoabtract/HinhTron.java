/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoabtract;

/**
 *
 * @author nkiem
 */
public class HinhTron extends Hinh {
    private double r;
	
	public HinhTron(ToaDo toaDo, double r) {
		super(toaDo);
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double tinhDienTich() {
		return Math.PI*this.r*this.r;
	}
}
