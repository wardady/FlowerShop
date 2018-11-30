package flowers.params;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public enum Color {
    RED("Red"), GREEN("Green"), BLUE("Blue");
    private final String name;

    Color(String name) {
        this.name = name;
    }
}
