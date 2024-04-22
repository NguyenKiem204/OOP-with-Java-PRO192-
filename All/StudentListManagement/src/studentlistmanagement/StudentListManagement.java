/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlistmanagement;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author nkiem
 */
public class StudentListManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList dssv = new StudentList();
        int yourchoice = 0;
        do {
            System.out.println("\u001B[4m\u001B[32m ==========================MENU==========================\u001B[0m");
            System.out.println("\u001B[32m║ ## Vui lòng chọn chức năng:                          ║\u001B[0m");
            System.out.println("\u001B[32m║=======================================================\u001B[0m");
            System.out.println("\u001B[36m║ 1. Nhập một danh sách sinh viên.                     ║\u001B[0m");
            System.out.println("\u001B[36m║ 2. Thêm 1 sinh viên vào danh sách.                   ║\u001B[0m");
            System.out.println("\u001B[33m║ 3. In danh sách sinh viên ra màn hình.               ║\u001B[0m");
            System.out.println("\u001B[36m║ 4. Lấy ra số lượng sinh viên trong danh sách.        ║\u001B[0m");
            System.out.println("\u001B[35m║ 5. Làm rỗng danh sách sinh viên.                     ║\u001B[0m");          
            System.out.println("\u001B[30m║ 6. Xóa một sinh viên ra khỏi danh sách.              ║\u001B[0m");
            System.out.println("\u001B[32m║ 7. Tìm kiếm tất cả sinh viên dựa trên\u001B[0m\u001B[36m Tên\u001B[32m.           ║\u001B[0m");
            System.out.println("\u001B[32m║ 8. Tìm kiếm tất cả sinh viên dựa trên\u001B[36m ID.            ║\u001B[0m");
            System.out.println("\u001B[33m║ 9. Xuất ra danh sách sinh viên có điểm cao đến thấp. ║\u001B[0m");
            System.out.println("\u001B[33m║ 10. Tải danh sách Sinh viên từ File                  ║\u001B[0m");
            System.out.println("\u001B[31m║ 0. Thoát khỏi chương trình.                          ║\u001B[0m");
            System.out.println("\u001B[32m ======================================================== \u001B[0m");

            yourchoice = sc.nextInt();
            sc.nextLine();
            switch (yourchoice) {
                case 1:
                    System.out.print("Số sinh viên trong danh sách là: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 1; i <= n; i++) {
                        System.out.printf("Sinh Viên %d\n", i);
                        System.out.print("Nhập mã sinh viên : ");
                        String id = sc.nextLine();
                        System.out.print("Nhập Họ và Tên: ");
                        String name = sc.nextLine();
                        int yob;
                        while (true) {
                            try {
                                System.out.print("Nhập năm sinh: ");
                                yob = sc.nextInt();
                                break;
                            } catch (Exception e) {
                                System.out.println("Do you know input positive number!!!");
                                sc.nextLine();
                            }
                        }
                        double gpa;
                        while (true) {
                            try {
                                System.out.print("Nhập điểm trung bình: ");
                                gpa = sc.nextDouble();
                                break;
                            } catch (Exception e) {
                                System.out.println("Do you know input Realnumber!!!");
                                sc.nextLine();
                            }
                        }
                        Student sv = new Student(id, name, yob, gpa);
                        dssv.addStudent(sv);
                        sc.nextLine();
                        File f = new File("data\\Studen.txt");
                        dssv.ghiDuLieuXuongFile(f);
                    }
                    break;
                case 2:

                    System.out.print("Nhập mã sinh viên: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập Họ và Tên: ");
                    String name = sc.nextLine();
                    int yob;
                    while (true) {
                        try {
                            System.out.print("Nhập năm sinh: ");
                            yob = sc.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("Do you know input positive number!!!");
                            sc.nextLine();
                        }
                    }
                    double gpa;
                    while (true) {
                        try {
                            System.out.print("Nhập điểm trung bình: ");
                            gpa = sc.nextDouble();
                            break;
                        } catch (Exception e) {
                            System.out.println("Do you know input Realnumber!!!");
                            sc.nextLine();
                        }
                    }
                    sc.nextLine();
                    Student sv = new Student(id, name, yob, gpa);
                    dssv.addStudent(sv);
                    File f = new File("data\\Studen.txt");
                        dssv.ghiDuLieuXuongFile(f);
                    break;
                case 3:
                    dssv.printStudentList();
                    break;
              
                case 4:
                    System.out.println("Số lượng sinh viên là: " + dssv.numberStudent());
                    break;
                case 5:
                    dssv.removeAll();
                    System.out.println("Đã làm rỗng danh sách!!!");
                    break;
                case 6:
                    System.out.print("Nhập mã sinh viên cần xóa: ");
                    String mssv2 = sc.nextLine();
                    Student sv1 = new Student(mssv2);
                    dssv.xoaSinhVien(sv1);
                    System.out.println("Delete student: " + dssv.xoaSinhVien(sv1));
                    break;
                case 7:
                    System.out.print("Nhập Họ và Tên: ");
                    String name1 = sc.nextLine();
                    System.out.println("Kết quả tìm kiếm: ");
                    dssv.SearchNameStudent(name1);
                    break;
                case 8:
                    System.out.print("Nhập id: ");
                    String id1 = sc.nextLine();
                    System.out.println("Kết quả tìm kiếm: ");
                    dssv.SearchIdStudent(id1);
                    break;
                case 9:
                    dssv.sortGpa();
                    dssv.printStudentList();
                    break;
                  case 10:
                    File l = new File("data\\Studen.txt");
                        dssv.docDuLieuTuFile(l);
                    break;
                default:

            }
        } while (true);
    }

}
