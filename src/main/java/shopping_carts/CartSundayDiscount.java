package shopping_carts;

import flowers.FlowerBouquet;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Calendar;
@ToString
public class CartSundayDiscount extends DiscountCartsDecorator {
    public CartSundayDiscount(Cart cart) {
        super(cart, 0.3);
    }

    @Override
    public double getPrice() {
        Calendar c = Calendar.getInstance();
        if (c.get(Calendar.DAY_OF_WEEK) == 7) {
            return cart.getPrice() * (1 - discount);
        } else {
            return cart.getPrice();
        }
    }

    @Override
    public ArrayList<FlowerBouquet> getBouquets() {
        return cart.getBouquets();
    }
}
