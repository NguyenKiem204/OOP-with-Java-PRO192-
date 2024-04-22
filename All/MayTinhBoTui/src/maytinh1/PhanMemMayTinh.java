/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maytinh1;

/**
 *
 * @author nkiem
 */
public class PhanMemMayTinh implements MayTinhBoTuiInterface, SapXepInterface{

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
   @Override
    public void sapxeptang(double[] arr) {
        int n = arr.length;
		double key;
		int i, j;
		for (i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
    }

    @Override
    public void sapxepgiam(double[] arr) {
        int n = arr.length;
		double key;
		int i, j;
		for (i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
    
}
