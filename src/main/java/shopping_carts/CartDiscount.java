package shopping_carts;

import flowers.FlowerBouquet;
import lombok.ToString;

import java.util.ArrayList;

@ToString
public class CartDiscount extends  DiscountCartsDecorator {
    public CartDiscount(Cart cart, double discount) {
        super(cart, discount);
    }

    @Override
    public double getPrice() {
        return cart.getPrice()-(1*discount);
    }

    @Override
    public ArrayList<FlowerBouquet> getBouquets() {
        return cart.getBouquets();
    }
}
