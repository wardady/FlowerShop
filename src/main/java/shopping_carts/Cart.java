package shopping_carts;

import flowers.FlowerBouquet;

import java.util.ArrayList;

public interface Cart {
    double getPrice();
    void addBouquet(FlowerBouquet bouquet);
    void deleteBouquet(FlowerBouquet bouquet);
    ArrayList<FlowerBouquet> getBouquets();
}
