package flowers.params;


import lombok.Getter;
import lombok.ToString;
@Getter
@ToString
public enum Country {
    HOLAND("Holand"),UKRAINE("Ukraine"),GREATBRITAN("GB");
    private final String country;
    Country(String country){
        this.country = country;
    }
}
