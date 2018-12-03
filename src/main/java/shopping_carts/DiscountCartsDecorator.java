package shopping_carts;

import flowers.FlowerBouquet;

public abstract class DiscountCarts implements Cart {
    protected Cart cart;
    protected double discount;

    public DiscountCarts(Cart cart, double discount) {
        this.cart = cart;
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        return cart.getPrice() * (1 - discount);
    }

    public void addBouquet(FlowerBouquet bouquet) {
        cart.addBouquet(bouquet);
    }
    public void deleteBouquet(FlowerBouquet bouquet) {
        cart.deleteBouquet(bouquet);
    }
}
