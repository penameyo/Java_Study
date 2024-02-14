package weeklytest01;

import Chapter07.Calculator;

public class Cart {
    private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public int getTotalPrice() {
        int total = 0;
        for (Product product : products) {
            total = total + product.price;
        }
        return total;
    }

    public int getTotalPriceIncludeDiscount() {
        int total = 0;
        for (Product product : products) {
            int price;
            price = product.getPrice() - product.getDiscountAmount();
            total += price;
        }
        return total;
    }

    public double getTotalWeight() {
        double weight = 0;
        for (Product product : products) {
            weight += product.weight;
        }
        return weight;

    }

    public int calculateDeliveryCharge() {
        Calculator.getDeliveryCharge(
                getTotalWeight(), getTotalPriceIncludeDiscount());
        return 0;
    }

}
