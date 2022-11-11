package flower.store.flower;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Flowers. We sell them
 */

@Getter @Setter @ToString
public class Flower {
    private final FlowerSpec spec = new FlowerSpec();

    private double price;

    private FlowerType flowerType;

    /**
     * constructor
     */
    public Flower() { }

    /**
     * getter for sepalLength
     * @return sepalLength
     */
    public double getSepalLength() {
        return spec.getSepalLength();
    }

    /**
     *  setter for sepalLength
     * @param sepalLength sepalLength
     */
    public void setSepalLength(double sepalLength) {
        spec.setSepalLength(sepalLength);
    }

    /**
     *  setter for color
     * @param color flower color
     */

    public void setColor(FlowerColor color) {
        spec.setColor(color);
    }

    /**
     *  getter for color
     * @return flower color
     */
    public String getColor() {
        return spec.getColor().toString();
    }



}
