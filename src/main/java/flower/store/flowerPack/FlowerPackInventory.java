package flower.store.flowerPack;

import flower.store.flower.Flower;


public class FlowerPackInventory extends FlowerPack {
    public <T extends Flower> FlowerPackInventory(T flower, int quantity) {
        super(flower, quantity);
    }
    public FlowerPack splitFLowerPack(int newPackSize){
        if (newPackSize<=quantity){
            quantity -= newPackSize;
            return new FlowerPack(flower,newPackSize);
        }
        return null;

    }
    public void addFLowers(int amount){
        quantity += amount;
    }
}
