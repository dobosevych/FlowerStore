package flower.store;

import flower.store.flower.Flower;
import flower.store.flower.FlowerColor;
import flower.store.flower.FlowerFactory;
import flower.store.flower.FlowerSpec;

import java.util.ArrayList;

import java.util.List;


public class FlowerInventory {
    private final List<Flower> inventory = new ArrayList<>();
    public FlowerInventory(){

        Flower redFlower = FlowerFactory.createFlower(10, FlowerColor.RED, 0.5);
        Flower blueFlower = FlowerFactory.createFlower(30, FlowerColor.BLUE, 2);
        Flower whiteFlower = FlowerFactory.createFlower(100, FlowerColor.WHITE, 10);

        inventory.add(redFlower);
        inventory.add(blueFlower);
        inventory.add(whiteFlower);

    }
    public List<Flower> search(FlowerSpec searchSpec){
        List<Flower> matchingFlowers = new ArrayList<>();
        for (Flower flower : inventory) {
            FlowerSpec flowerSpec = flower.getSpec();
            if (searchSpec.getColor() != flowerSpec.getColor())
                continue;
            if (searchSpec.getSepalLength() != flowerSpec.getSepalLength())
                continue;
            matchingFlowers.add(flower);
        }
        return matchingFlowers;
    }
}

