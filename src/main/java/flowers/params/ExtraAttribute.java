package flowers.params;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum ExtraAttribute {
    PLEASANT_SMELL("Smell pleasant"),SPIKES("Spikes"),LUXURY("Luxury");
    private String attribute;
    ExtraAttribute(String attribute){
        this.attribute = attribute;
    }
}
