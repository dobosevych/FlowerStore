package flower.store.flower;

public class FlowerFactory {
    public static Flower createFlower(int price,
                                      FlowerColor color,
                                      double sepalLength){
        Flower flower = new Flower();
        flower.setPrice(price);
        flower.setColor(color);
        flower.setSepalLength(sepalLength);
        return flower;
    }
}
