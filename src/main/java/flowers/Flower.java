package flowers;

import flowers.params.Color;
import flowers.params.Country;
import flowers.params.ExtraAttribute;
import flowers.params.FlowerType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Flower {
    private Color color;
    private double price;
    private double lengthOfTheStem;
    private Country country;
    private ArrayList<ExtraAttribute> extraAttributes;
    private FlowerType flowerType;
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
