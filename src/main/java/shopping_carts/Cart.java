package shopping_carts;

import flowers.FlowerBouquet;

public interface Cart {
    double getPrice();
    void addBouquet(FlowerBouquet bouquet);
    void deleteBouquet(FlowerBouquet bouquet);
}
