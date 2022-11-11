package flower.store;

import flower.store.flower.Flower;
import flower.store.flower.FlowerColor;
import flower.store.flower.FlowerFactory;
import flower.store.flower.FlowerSpec;

import java.util.ArrayList;

import java.util.List;

/**
 * flower inventory. here we store our flowers
 */
public class FlowerInventory {
    private final List<Flower> inventory = new ArrayList<>();

    /**
     * constructor for flower inventory
     * currently has only three flowers
     */
    public FlowerInventory() {
        double rfp = 10;
        double rsl = 0.5;
        double bfp = 30;
        double bsl = 2;
        double wfp = 100;
        double wsl = 10;
        Flower redFlower = FlowerFactory
                .createFlower(rfp, FlowerColor.RED, rsl);
        Flower blueFlower = FlowerFactory
                .createFlower(bfp, FlowerColor.BLUE, bsl);
        Flower whiteFlower = FlowerFactory
                .createFlower(wfp, FlowerColor.WHITE, wsl);

        inventory.add(redFlower);
        inventory.add(blueFlower);
        inventory.add(whiteFlower);

    }
    /**
     * search tool to find flowers in the inventory
     * @param searchSpec - is the specification for search
     * @return a list of flowers which fit the specification
     * */
    public List<Flower> search(FlowerSpec searchSpec) {

        List<Flower> matchingFlowers = new ArrayList<>();
        for (Flower flower : inventory) {
            FlowerSpec flowerSpec = flower.getSpec();
            if (searchSpec.getColor() != flowerSpec.getColor()) {
                continue;
            }
            if (searchSpec.getSepalLength() != flowerSpec.getSepalLength()) {
                continue;
            }
            matchingFlowers.add(flower);
        }
        return matchingFlowers;
    }
}

