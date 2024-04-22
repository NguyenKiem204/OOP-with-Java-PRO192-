
import entity.Customer;
import entity.Order;
import entity.OrderLine;
import entity.Product;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sonnt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer c1 = new Customer(1);
        Customer c2 = new Customer(2);
        
        Product p1 = new Product(1, 5);
        Product p2 = new Product(2, 8);
        Product p3 = new Product(3, 10);
        ArrayList<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        Product mostExpensive = Product.getMostExpensive(products); //getMostExpensive is not YET implemented
        System.out.println(mostExpensive.getId()); //PRINT CODE ->3
        
        Order o1 = new Order(1); //order that placed by customer 1
        o1.setCustomer(c1);
        OrderLine line11_1 = new OrderLine(); //c1 buy 2 p1
        line11_1.setOrder(o1);
        line11_1.setProduct(p1);
        line11_1.setQuantity(2);//10
        
        OrderLine line11_2 = new OrderLine(); //c1 buy 3 p2
        line11_2.setOrder(o1);
        line11_2.setProduct(p2);
        line11_2.setQuantity(3);//24
        
        o1.getLines().add(line11_1);
         o1.getLines().add(line11_2);
        float totalPaymentByO11 = o1.getTotalPayment(); //Return Sum all of(Product.price * quantity) made by this order
        System.out.println(o1.getId() +":"+ totalPaymentByO11); //PRINT CODE ->34
        
        Order o2 = new Order(2); //order that placed by customer 2
        o2.setCustomer(c2);
        OrderLine line2_1 = new OrderLine(); //c2 buy 1 p3
        line2_1.setOrder(o2);
        line2_1.setProduct(p3);
        line2_1.setQuantity(15);
        
        o2.getLines().add(line2_1);
        //sort order
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(o1);
        orders.add(o2);
        orders = sortOrdersByTotalPayment(orders);
        for (Order order : orders) {
            System.out.println(order.getId());//PRINT CODE -> 2,1
        }
    }
  public static ArrayList<Order> sortOrdersByTotalPayment(ArrayList<Order> orders) {
    ArrayList<Order> sortedOrders = new ArrayList<>(orders);
    Collections.sort(sortedOrders); 
    return sortedOrders;
}

}
