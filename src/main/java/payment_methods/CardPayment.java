package payment_methods;

import shopping_carts.Cart;

public class CardPayment implements Payment{

    @Override
    public boolean buy(Cart cart, double balance) {
        if (balance<cart.getPrice()){
            System.out.println("You`ve made a loan :)");
        }
        return true;
    }
}
