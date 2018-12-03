package payment_methods;

import lombok.Getter;
import shopping_carts.Cart;

@Getter
public class PaymentContext {
    private Payment payment;

    public PaymentContext(Payment payment) {
        this.payment = payment;
    }
    public boolean pay(Cart cart, double money){
        return payment.buy(cart,money);
    }
}
