package shopping_carts;

import flowers.FlowerBouquet;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;

@ToString
@Getter
public class RegularCart implements Cart {
    private ArrayList<FlowerBouquet> bouquets = new ArrayList<>();

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
