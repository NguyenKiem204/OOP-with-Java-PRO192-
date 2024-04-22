package model;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vaccine {
    private String name;
    private String code;
    private int quantity;
    private Date expirationDate;
    private double price;
    private Date lastInjectedDate;

    public Vaccine() {
    }

    public Vaccine(String name, String code, int quantity, Date expirationDate, double price, Date lastInjectedDate) {
        this.name = name;
        this.code = code;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.price = price;
        this.lastInjectedDate = lastInjectedDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getLastInjectedDate() {
        return lastInjectedDate;
    }

    public void setLastInjectedDate(Date lastInjectedDate) {
        this.lastInjectedDate = lastInjectedDate;
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        return "code=" + code  + ", name=" + name + ", quantity=" + quantity + ", expirationDate=" + df.format(expirationDate) + ", price=" + price + ", lastInjectedDate=" + df.format(lastInjectedDate);
    }   

    public boolean equals(Vaccine obj) {
        return this.code.equals(obj.getCode());
    }    
}
