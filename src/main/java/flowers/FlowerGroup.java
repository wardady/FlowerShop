package flowers;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FlowerGroup {
    private Flower flower;
    private int quantity;

    double getPrice() {
        return this.flower.getPrice() * this.quantity;
    }
}
