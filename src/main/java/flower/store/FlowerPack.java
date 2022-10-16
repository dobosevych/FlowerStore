package flower.store;

public class FlowerPack {
    private final Flower flower;
    private final int quantity;
    public int getPrice(){
        return (int)flower.getPrice()*quantity;
    }
    public <T extends Flower> FlowerPack(T flower, int quantity){
        this.flower = flower;
        this.quantity = quantity;
    }
}
