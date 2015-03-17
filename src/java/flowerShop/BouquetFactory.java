package flowerShop;

import flowerShop.Flower.Color;
import flowerShop.Flower.Fresh;
import java.util.Random;

public class BouquetFactory {

    public Bouquet getRandomBuket(int count) {

        Bouquet bouquet = new Bouquet();
        for (int i = 0; i < count; i++) {
            Color color = getRandomColor();
            Fresh fresh = getRandomFresh();
            bouquet.addFlower(new Flower(color, (int) (20*Math.random() * 2 + 20), fresh));
        }
        return bouquet;
    }

    private Color getRandomColor() {
        Flower.Color[] values = Flower.Color.values();
        Random rand = new Random();
        int nextInt = rand.nextInt(values.length);
        return values[nextInt];
    }
    private Fresh getRandomFresh() {
        Flower.Fresh[] values = Flower.Fresh.values();
        Random rand = new Random();
        int nextInt = rand.nextInt(values.length);
        return values[nextInt];
    }

}
