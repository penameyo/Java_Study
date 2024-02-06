package WeeklyTest;

import java.math.BigDecimal;

public class Product {
    String name;
    int price;
    double weight;

    public Product(String name, int price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public int getPrice() {
        return 0;
    }

    public double getWeight(){
        return weight;
    }

    public int getDiscountAmount(){
        return 0;
    }

}
