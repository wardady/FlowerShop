package shopping_carts;

public class CartDiscount extends  DiscountCartsDecorator {
    public CartDiscount(Cart cart, double discount) {
        super(cart, discount);
    }

    @Override
    public double getPrice() {
        return cart.getPrice()-(1*discount);
    }
}
