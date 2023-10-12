package flower.store;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

// @Getter @Setter
public class FlowerBucket {

    List<FlowerPack> FlowerPacks = new ArrayList<>();

    public void addFlowerPack(FlowerPack flowerPacks){
        FlowerPacks.add(flowerPacks);
    }

    public double getPrice(){

    }

}
