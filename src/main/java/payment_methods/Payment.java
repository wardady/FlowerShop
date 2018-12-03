package payment_methods;

import shopping_carts.Cart;

public interface Payment {
    boolean buy(Cart cart, double money);
}