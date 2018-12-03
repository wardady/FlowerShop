package shopping_carts;

import flowers.FlowerBouquet;

import java.util.ArrayList;

public class RegularCart implements Cart {
    private ArrayList<FlowerBouquet> bouquets;

    @Override
    public double getPrice() {
        double price = 0;
        for (FlowerBouquet b : this.bouquets) {
            price += b.getPrice();
        }
        return price;
    }

    @Override
    public void addBouquet(FlowerBouquet bouquet) {
        bouquets.add(bouquet);

    }

    @Override
    public void deleteBouquet(FlowerBouquet bouquet) {
        bouquets.remove(bouquet);
    }
}
