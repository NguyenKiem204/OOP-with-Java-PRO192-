

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nkiem
 */
public class TaiXiu {

    public static void main(String[] args) {
        double taiKhoanNguoiChoi = 1000000;
        Scanner sc = new Scanner(System.in);
//        Locale lc = new Locale("vi", "VN");
//        NumberFormat num = NumberFormat.getInstance();
        Locale lc = new Locale("vi", "VN");
        NumberFormat num = NumberFormat.getCurrencyInstance();

        int luachon = 0;
        do {
            System.out.println("------------------- Mời bạn lựa chọn --------------------");
            System.out.println("Tài khoản của bạn còn: " + num.format(taiKhoanNguoiChoi));
            System.out.println("Chọn 1 để tiếp tục chơi");
            System.out.println("Chọn phím bất kì để thoát");
            luachon = sc.nextInt();
            if (taiKhoanNguoiChoi == 0) {
                System.out.println("Bạn có muốn nạp thêm tiền không");
                System.out.println("Có(phím 2)\nKhông(phím 3)");
                int naptien = sc.nextInt();
                if (naptien == 2) {
                    System.out.print("Số tiền nạp là: ");
                    double bank = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Mã xác nhận là: ");
                    String code = sc.nextLine();
                    if (code.equals("kiem2004")) {
                        taiKhoanNguoiChoi += bank;
                        System.out.println("Nạp tiền thành công");
                        System.out.println("Tài khoản của bạn đã được cộng " + num.format(bank) + " vào tài khoản");
                    } else {
                        System.out.println("Mã code sai !!");
                        System.out.println("Nạp tiền thất bại");
                        continue;
                    }
                }
            }

            if (luachon == 1) {
                System.out.println("Bắt đầu chơi");
                System.out.println("Tài khoản của bạn: " + num.format(taiKhoanNguoiChoi) + ", bạn muốn cược bao nhiêu");
                int datcuoc = 0;
                do {
                    System.out.println("Số tiền đặt cược phải lớn hơn 0 nhỏ thua " + num.format(taiKhoanNguoiChoi) + ": ");
                    datcuoc = sc.nextInt();
                } while (datcuoc <= 0 || datcuoc > taiKhoanNguoiChoi);
                int luaChonTaiXiu = 0;
                do {
                    System.out.println("Chọn Tài nhập phím 1");
                    System.out.println("Chọn Xỉu nhập phím 2");
                    luaChonTaiXiu = sc.nextInt();
                } while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);
                Random xucXac1 = new Random();
                Random xucXac2 = new Random();
                Random xucXac3 = new Random();

                int GiaTri1 = xucXac1.nextInt(5) + 1;
                int GiaTri2 = xucXac2.nextInt(5) + 1;
                int GiaTri3 = xucXac3.nextInt(5) + 1;
                int tong = GiaTri1 + GiaTri2 + GiaTri3;
                System.out.println("Kết quả: " + GiaTri1 + "-" + GiaTri2 + "-" + GiaTri3);
                if (tong == 3 || tong == 18) {
                    taiKhoanNguoiChoi = taiKhoanNguoiChoi - datcuoc;
                } else if (tong >= 4 && tong <= 10) {
                    System.out.println("Tổng là: " + tong + "=> Xỉu!");
                    if (luaChonTaiXiu == 2) {
                        System.out.println("Bạn đã thắng cược ");
                        taiKhoanNguoiChoi += datcuoc;
                        System.out.println("Tài khoản của bạn là: " + num.format(taiKhoanNguoiChoi));

                    } else {
                        taiKhoanNguoiChoi -= datcuoc;
                        System.out.println("Bạn đã thua cược");
                        System.out.println("Tài khoản của bạn là: " + num.format(taiKhoanNguoiChoi));
                    }
                } else {
                    System.out.println("Tổng là: " + tong + "=> Tài!");
                    if (luaChonTaiXiu == 1) {
                        System.out.println("Bạn đã thắng cược ");
                        taiKhoanNguoiChoi += datcuoc;
                        System.out.println("Tài khoản của bạn là: " + num.format(taiKhoanNguoiChoi));

                    } else {
                        taiKhoanNguoiChoi -= datcuoc;
                        System.out.println("Bạn đã thua cược");
                        System.out.println("Tài khoản của bạn là: " + num.format(taiKhoanNguoiChoi));
                    }
                }

            }

        } while (luachon == 1);

    }

}
