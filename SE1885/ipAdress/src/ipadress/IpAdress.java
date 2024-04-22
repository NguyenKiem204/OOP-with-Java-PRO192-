/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ipadress;

import java.util.Scanner;

/**
 *
 * @author nkiem
 */
public class IpAdress {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = "192.168.";
        int nuberHost;
        int s3;
        String s5;
        int s6 = 1;
        int s7;
        int s4;
        int s8;
        int s2 = 0;
        int n1;

        System.out.print("Số lượng NetWork là: ");
        int n = sc.nextInt();
        LAN arr[] = new LAN[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Số lượng Host NetWork " + (i + 1) + " là: ");
            nuberHost = sc.nextInt();
            s3 = calculatePrefix(nuberHost);
            n1 = (int) Math.pow(2, 32 - s3);
            s5 = calculateSubnetMask(s3);
            s7 = s6 + (int) Math.pow(2, 32 - s3) - 3;
            s8 = (int) Math.pow(2, 32 - s3) - 2;
            s4 = (s7 + 1);
            arr[i] = new LAN(s1, s2, s3,
                    s4, s5, s6, s7, s8);
            s6 = s2 + 1 + n1;
            s2 = s2 + (int) Math.pow(2, 32 - s3);
        }
        System.out.println("======================================================================================================");
        System.out.println("|| Network address || Broadcast   ||    Subnetmask   || The First IP || The Last IP  || Num usable IP||" );
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

    public static int calculatePrefix(int hosts) {
        return 32 - (int) Math.ceil(Math.log(hosts + 2) / Math.log(2)); // nó chính là log2(host+2)
    }

    public static String calculateSubnetMask(int prefix) {
        int mask = -1 << (32 - prefix);
//Số -1 trong biểu diễn nhị phân là một chuỗi các bit 1, 
//kiểu int là 32 bit, vì vậy -1 sẽ được biểu diễn là 11111111 11111111 11111111 11111111.
//        System.out.println("Mask: " + mask);
//        System.out.println("Mask (binary): " + Integer.toBinaryString(mask));
        return String.format("%d.%d.%d.%d", (mask >>> 24) & 0xFF, (mask >>> 16) & 0xFF, (mask >>> 8) & 0xFF, mask & 0xFF);
    }
}
