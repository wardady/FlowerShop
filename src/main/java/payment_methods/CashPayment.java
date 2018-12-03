package payment_methods;

import shopping_carts.Cart;

public class CashPayment implements Payment {
    @Override
    public boolean buy(Cart cart, double money) {
        if (cart.getPrice() < money) {
            System.out.println("Paid successfully buy cash!");
            return true;
        } else {
            System.out.println("Error, not enough money");
            return false;
        }
    }
}
