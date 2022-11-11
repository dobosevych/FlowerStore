package flower.store.bucket;

import flower.store.flower.Flower;
import flower.store.flowerPack.FlowerPack;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucketSpec {
    @Getter
    private final List<Flower> flowers = new ArrayList<>();
    public int getSize() {
        return flowers.size();
    }
    public boolean contains(Flower flower){
        return flowers.contains(flower);
    }
    public void add(FlowerPack fp) {
        flowers.add(fp.getFlower());
    }

}
