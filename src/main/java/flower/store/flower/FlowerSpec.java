package flower.store.flower;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * stores general data about a flower
 */

@Getter @Setter @ToString
public class FlowerSpec {
    /**
     * constructor
     */
    public FlowerSpec() {}
    /**
     * handles input
     * @param color color of the flower
     */
    public void setColor(FlowerColor color) {
        this.color = color;
    }

    /**
     * handles input
     * @param color color of the flower
     */
    public void setColor(String color) {
        if (color.equalsIgnoreCase("red")) {
            this.color = FlowerColor.RED;
        }
        else if (color.equalsIgnoreCase("blue")) {
            this.color = FlowerColor.BLUE;
        }
        else if (color.equalsIgnoreCase("white")) {
            this.color = FlowerColor.WHITE;
        }
    }

    private FlowerColor color;
    private double sepalLength;

}
