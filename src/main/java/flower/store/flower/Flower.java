package flower.store.flower;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter @ToString
public class Flower {
    private FlowerSpec spec = new FlowerSpec();

    public double getSepalLength(){
        return spec.getSepalLength();
    }
    public void setSepalLength(double sepalLength){
        spec.setSepalLength(sepalLength);
    }

    public void setColor(FlowerColor color){
        spec.setColor(color);
    }
    public String getColor() {
        return spec.getColor().toString();
    }

    private double price;

    private FlowerType flowerType;



}
