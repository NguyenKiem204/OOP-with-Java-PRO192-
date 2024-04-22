/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

/**
 *
 * @author nkiem
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    private static  int x = 100;          
      interface A{
          void food();
          void fuck();
      }
      class B implements A{

        @Override
        public void food() {
            System.out.println("hiccc");        }

        @Override
        public void fuck() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
          
      }
      
    public static void main(String[] args) {
      Test.x++;
      System.out.println(x);
      int[] a = {1,2,3,4};
      int b = 1;
      int c = 3;
      a[b] = c;
        for (int i : a) {
            System.out.println(i);
        }
//        System.out.println(a[6]);
String s = new String("hinho");
int iBegin = 1;
char iEnd = 3;
System.out.println(s.substring(iBegin, iEnd));
ha t = new hu();

}
   
}
