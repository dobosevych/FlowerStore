package flower.store.flower;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("red"),//("#FF0000"),
    BLUE("blue"),//("#0000FF"),
    WHITE("white");//("#000000");
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
