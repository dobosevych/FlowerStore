package flower.store.flowers;

import flower.store.flower.Flower;
import flower.store.flower.FlowerColor;
import flower.store.flower.FlowerType;

public class Rose extends Flower {
    public Rose(){
        super();
        setColor(FlowerColor.RED);
        setFlowerType(FlowerType.ROSE);
    }
}
