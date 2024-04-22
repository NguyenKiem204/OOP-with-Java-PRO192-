/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

// khuoon dùng để đúc ra các object, 
//đối tượng cần lưu trữ infor, thứ làm ra để bán
// khuôn phải kín, có phễu đế/ rót/ hứng/ đổ vào
// vào cái data, nguyên liệu
public class Dog {
    /* chứa đặc điểm chi tiết mà cái khuôn, object tương lai sẽ có
    khuôn déign ra sao, mai mốt object có thể
       */
    private String name;
    private int yob;
    private double weight;
    

    public Dog(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    

    public void bark(){
        System.out.printf("Name is %-10s || Year of date: %4d || Weight: %4.1f\n",
                name, yob, weight);
    }

/*    @Override
    public String toString() {
        //return "Dog{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
       // String tmp = String.format("Name is %-10s || Year of date: %4d || Weight: %4.1f\n",
        //        name, yob, weight);
        //return tmp;
        return String.format("Name is %-10s || Year of date: %4d || Weight: %4.1f",
                name, yob, weight);
    }*/
    
}
