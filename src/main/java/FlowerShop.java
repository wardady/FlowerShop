import config.DefaultBouquets;
import flowers.Flower;
import flowers.FlowerBouquet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class FlowerShop {
    private ArrayList<FlowerBouquet> bouquets = DefaultBouquets.getInstance().getDefaultBuckets();
    private ArrayList<Flower> flowers;

    public FlowerBouquet buyBouquet(FlowerBouquet ordered, Double payment) {
        if (this.bouquets.contains(ordered)&&payment >= ordered.getPrice()) {
            this.bouquets.remove(ordered);
            return ordered;
        }
        else{
            System.out.println("There is no such bouquet or wrong payment!");
        }
    }


}
