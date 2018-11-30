package flowers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;

@ToString
@Setter
@Getter
public class FlowerBouquet {
    private ArrayList<FlowerGroup> flowerGroups;

    public FlowerBouquet(){
        flowerGroups = new ArrayList<>();
    }
    public void addFlower(FlowerGroup flowerGroup){
        flowerGroups.add(flowerGroup);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerGroup flowerGroup : flowerGroups) {
            price += flowerGroup.getPrice();
        }
        return price;
    }
}
