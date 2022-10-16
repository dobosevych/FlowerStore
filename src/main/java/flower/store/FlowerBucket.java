package flower.store;

import lombok.Getter;

public class FlowerBucket{
    @Getter
    private int price = 0;

    public FlowerBucket(){

    }
    public void add(FlowerPack fp){
        price += fp.getPrice();
    }
}
