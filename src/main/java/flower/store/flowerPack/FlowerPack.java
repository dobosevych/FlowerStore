package flower.store.flowerPack;

import flower.store.flower.Flower;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlowerPack {

    protected final Flower flower;
    protected int quantity;
    public int getPrice() {
        return (int)flower.getPrice()*quantity;
    }
    public <T extends Flower> FlowerPack(T flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }

}
