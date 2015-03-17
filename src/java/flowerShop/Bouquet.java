package flowerShop;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Bouquet {

    private List<Flower> flowerList = new ArrayList<>();

    public List<Flower> getFlowerList() {
        return flowerList;
    }

    public void addFlower(Flower flower) {
        flowerList.add(flower);
    }

    public void delFlower(int id) {
        Flower flower = findFlower(id);
        flowerList.remove(flower);
    }

    public Flower findFlower(int id) {
        for (Flower item : flowerList) {
            if (item.getId() == id) {
               return item;
            }
        }
        throw new NoSuchElementException();
    }

    public String print() {
        String info = "";
        for (Flower item : flowerList) {
            info += "\n\t" + item.getId() + ")"
                    + " Color: " + item.getColor()
                    + ", Height: " + item.getHeight()
                    + ", Fresh: " + item.getFresh();
        }
        return info;
    }

}
