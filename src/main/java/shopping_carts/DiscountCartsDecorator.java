package shopping_carts;

import flowers.FlowerBouquet;

public abstract class DiscountCartsDecorator implements Cart {
    protected Cart cart;
    protected double discount;

    public DiscountCartsDecorator(Cart cart, double discount) {
        this.cart = cart;
        this.discount = discount;
    }

    public void addBouquet(FlowerBouquet bouquet) {
        cart.addBouquet(bouquet);
    }

    public void deleteBouquet(FlowerBouquet bouquet) {
        cart.deleteBouquet(bouquet);
    }
}
