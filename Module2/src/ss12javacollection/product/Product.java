package ss12javacollection.product;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
    private int id;
    private String name;
    private Date birtDay;
    private double price;

    public Product() {
    }

    public Product(int id, String name, Date birtDay, double price) {
        this.id = id;
        this.name = name;
        this.birtDay = birtDay;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirtDay() {
        return birtDay;
    }

    public void setBirtDay(Date birtDay) {
        this.birtDay = birtDay;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birtDay=" + dateFormat.format(birtDay) +
                ", price=" + price +
                '}';
    }
}
