
package flower.store;

import flower.store.flower.Flower;
import flower.store.flower.FlowerColor;
import flower.store.flower.FlowerFactory;
import flower.store.flower.FlowerSpec;

import java.util.List;
import java.util.Scanner;

/**
 * flower store class
 * come and buy some!
 */

public class FlowerStore {
    /**
     * constructor
     */
    private FlowerStore() { }
    private static final
    FlowerInventory FLOWER_INVENTORY = new FlowerInventory();

    /**
     * the main  method
     * @param args arguments
     */

    public static void main(String[] args) {
        Flower redFlower = FlowerFactory
                .createFlower(10, FlowerColor.RED, 0.5);
        Flower blueFlower = FlowerFactory
                .createFlower(30, FlowerColor.BLUE, 2);
        Flower whiteFlower = FlowerFactory
                .createFlower(100, FlowerColor.WHITE, 10);
        FLOWER_INVENTORY.addFlower(redFlower);
        FLOWER_INVENTORY.addFlower(blueFlower);
        FLOWER_INVENTORY.addFlower(whiteFlower);

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter the color: ");
        String color = sc.nextLine();
        System.out.print("Please, enter the sepalLength: ");
        double sepalLength = sc.nextDouble();
        List<Flower> matchingFlowers = search(color, sepalLength);
        System.out.print("We found: "
                + matchingFlowers.toString());
    }

    /**
     * searches for flowers in the inventory
     * @param color the color of the flower
     * @param sepalLength the sepalLength of the flower
     * @return a list of all flowers
     */
    public static List<Flower> search(final String color,
                                      final double sepalLength) {
        FlowerSpec searchSpec = new FlowerSpec();
        searchSpec.setSepalLength(sepalLength);
        searchSpec.setColor(color);
        return FLOWER_INVENTORY.search(searchSpec);
    }
}
