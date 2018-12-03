package shopping_carts;

import java.util.Calendar;

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
}
