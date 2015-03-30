package flowerShop;

import flowerShop.characteristics.Color;
import flowerShop.characteristics.Fresh;

public class Flower {

    private static int nextId = 1;
    private int id = 1;
    private final Color color;
    private final int height;
    private final Fresh fresh;

    public Flower(Color color, int height, Fresh fresh) {
        this.id = getNextId();
        this.color = color;
        this.height = height;
        this.fresh = fresh;
    }

    private static int getNextId() {
        return nextId++;
    }

    public int getId() {
        return id;
    }

    public Color getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public Fresh getFresh() {
        return fresh;
    }

}
