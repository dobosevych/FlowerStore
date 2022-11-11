
package flower.store.bucket;

import flower.store.flowerPack.FlowerPack;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
/**
 * bucket
 * */

public class FlowerBucket {
    /**
     * constructor
     */
    public FlowerBucket() {}
    @Getter
    private int price = 0;

    private final List<FlowerPack> flowerPacks = new ArrayList<>();

    /**
     * adds flowerpacks to bucket
     * @param fp flower pack
     */
    public void add(final FlowerPack fp) {
        flowerPacks.add(fp);
        price += fp.getPrice();
    }

    /**
     *
     * @return string representation of flower bucket
     */
    @Override
    public String toString() {
        String res = "";
        for (FlowerPack fp
                : flowerPacks) {
            res
            = res.concat(fp.toString());
        }
        return res;
    }
}
