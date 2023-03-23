package entities;

import java.util.Date;

public class UsedProduct extends Product {

    private Date date;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, Date date) {
        super(name, price);
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String priceTag() {
        return name + " (Usede) " + String.format("%.2f", price) + " (Manufatcure date: " + date + ")";
    }
}
