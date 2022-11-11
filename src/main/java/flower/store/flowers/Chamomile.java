package flower.store.flowers;

import flower.store.flower.Flower;
import flower.store.flower.FlowerColor;
import flower.store.flower.FlowerType;

public class Chamomile extends Flower {
    public Chamomile(){
        super();
        setColor(FlowerColor.WHITE);
        setFlowerType(FlowerType.CHAMOMILE);
    }
}
