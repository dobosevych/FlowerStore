package flower.store;

import flower.store.flower.Flower;
import flower.store.flower.FlowerSpec;

import java.util.List;
import java.util.Scanner;

public class FlowerStore {
    private static final FlowerInventory flowerInventory = new FlowerInventory();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter the color: ");
        String color = sc.nextLine();
        System.out.print("Please, enter the sepalLength: ");
        double sepalLength = sc.nextDouble();
        List<Flower> matchingFlowers = search(color, sepalLength);
        System.out.print("We found: " +
                matchingFlowers.toString());
    }
    public static List<Flower> search(String color, double sepalLength){
        FlowerSpec searchSpec = new FlowerSpec();
        searchSpec.setSepalLength(sepalLength);
        searchSpec.setColor(color);
        return flowerInventory.search(searchSpec);
    }
}
