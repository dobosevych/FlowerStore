package flower.store;

import java.util.ArrayList;
import java.util.List;

// @Getter @Setter
public class FlowerBucket {

    private List<FlowerPack> FlowerPacks = new ArrayList<>();

    public void addFlowerPack(FlowerPack flowerPacks) {
        FlowerPacks.add(flowerPacks);
    }

    public double getPrice() {

    }

}
