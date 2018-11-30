package flowers.params;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum FlowerType {
    ROSIE("Rosie"),TULIP("Tulip"),CHAMOMILE("Chamomile");
    private String type;
    FlowerType(String type){
        this.type = type;
    }
}
