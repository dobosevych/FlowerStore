
package flower.store;

import flower.store.flower.Flower;
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
    private FlowerStore() {}
    private static final
    FlowerInventory flowerInventory = new FlowerInventory();

    /**
     * the main  method
     * @param args arguments
     */

    public static void main(String[] args) {
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
        return flowerInventory.search(searchSpec);
    }
}
