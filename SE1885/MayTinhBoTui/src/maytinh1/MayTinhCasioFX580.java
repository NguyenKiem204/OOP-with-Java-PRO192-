/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maytinh1;

/**
 *
 * @author nkiem
 */
public class MayTinhCasioFX580 implements MayTinhBoTuiInterface {

    @Override
    public double cong(double a, double b) {
        return a + b;
    }

    @Override
    public double tru(double a, double b) {
        return a - b;
    }

    @Override
    public double nhan(double a, double b) {
        return a + b;
    }

    @Override
    public double chia(double a, double b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println("Bạn có biết b khác 0?");
            return 0;
        }
    }
}
