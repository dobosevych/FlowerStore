package flower.store.flowers;

import flower.store.flower.Flower;
import flower.store.flower.FlowerColor;
import flower.store.flower.FlowerType;

public class Tulip extends Flower {
    public Tulip(){
        super();
        setColor(FlowerColor.RED);
        setFlowerType(FlowerType.TULIP);
    }
}
