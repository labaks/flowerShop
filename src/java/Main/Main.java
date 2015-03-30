package Main;

import auth.Auth;
import auth.User;
import flowerShop.Bouquet;
import flowerShop.BouquetFactory;
import flowerShop.characteristics.Color;
import flowerShop.characteristics.Fresh;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class Main {

    private User user = new User();
    boolean authComplite;
    int choose = 0;
    private Integer minFlowers;
    private Integer maxFlowers;
    private Bouquet bouquet = null;
    private int enteredId;
    private Color color = Color.BLUE;
    private Fresh fresh = Fresh.FRESH;

    public Fresh getFresh() {
        return fresh;
    }

    public void setFresh(Fresh fresh) {
        this.fresh = fresh;
    }
    public List<Fresh> getFreshValues() {
        return  Arrays.asList(Fresh.values());
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public List<Color> getColorValues() {
        return  Arrays.asList(Color.values());
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isAuthComplite() {
        return authComplite;
    }

    public int getChoose() {
        return choose;
    }

    public void setChoose(int choose) {
        this.choose = choose;
    }

    public Integer getMinFlowers() {
        return minFlowers;
    }

    public void setMinFlowers(Integer minFlowers) {
        this.minFlowers = minFlowers;
    }

    public Integer getMaxFlowers() {
        return maxFlowers;
    }

    public void setMaxFlowers(Integer maxFlowers) {
        this.maxFlowers = maxFlowers;
    }

    public Bouquet getBouquet() {
        return bouquet;
    }

    public void setBouquet(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    public int getEnteredId() {
        return enteredId;
    }

    public void setEnteredId(int EnteredId) {
        this.enteredId = EnteredId;
    }

    public void auth() {
        authComplite = Auth.auth(user);
    }

    public void randomBouquet() {
        BouquetFactory saler = new BouquetFactory();
        int average = average(minFlowers, maxFlowers);
        bouquet = saler.getRandomBouquet(average);
    }

    private static int average(int min, int max) {
        return (min + max) / 2;
    }

    public void logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }

}
