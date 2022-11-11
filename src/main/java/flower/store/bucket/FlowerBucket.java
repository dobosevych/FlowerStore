package flower.store.bucket;

import flower.store.flowerPack.FlowerPack;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    @Getter
    private int price = 0;

    private final List<FlowerPack> flowerPacks = new ArrayList<>();
    public FlowerBucket() {

    }

    public void add(FlowerPack fp) {
        flowerPacks.add(fp);
        price += fp.getPrice();
    }
    @Override
    public String toString(){
        String res = "";
        for (FlowerPack fp :
                flowerPacks) {
            res =
            res.concat(fp.toString());
        }
        return res;
    }
}
