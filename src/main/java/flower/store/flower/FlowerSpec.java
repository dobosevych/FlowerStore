package flower.store.flower;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter @ToString
public class FlowerSpec {

    public FlowerColor getColor() {
        return color;
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }
    public void setColor(String color) {
        if (color.equalsIgnoreCase("red"))
            this.color = FlowerColor.RED;
        else if (color.equalsIgnoreCase("blue"))
            this.color = FlowerColor.BLUE;
        else if (color.equalsIgnoreCase("white"))
            this.color = FlowerColor.WHITE;
    }

    private FlowerColor color;
    private double sepalLength;

}
