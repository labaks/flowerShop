package flowerShop;

import flowerShop.characteristics.Fresh;
import flowerShop.characteristics.Color;
import java.util.Random;

public class BouquetFactory {

    public Bouquet getRandomBouquet(int count) {

        Bouquet bouquet = new Bouquet();
        for (int i = 0; i < count; i++) {
            Color color = getRandomColor();
            Fresh fresh = getRandomFresh();
            bouquet.addFlower(new Flower(color, (int) (20*Math.random() * 2 + 20), fresh));
        }
        return bouquet;
    }

    private Color getRandomColor() {
        Color[] values = Color.values();
        Random rand = new Random();
        int nextInt = rand.nextInt(values.length);
        return values[nextInt];
    }
    private Fresh getRandomFresh() {
        Fresh[] values = Fresh.values();
        Random rand = new Random();
        int nextInt = rand.nextInt(values.length);
        return values[nextInt];
    }

}
