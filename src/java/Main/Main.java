package Main;

import auth.Auth;
import auth.User;
import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Main {

    private User user = new User();
    boolean authComplite;
    int choose = 0;

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

    public void auth() {

        authComplite = Auth.auth(user);

    }

    private static Integer enterNum(String err) throws IOException {
        Integer num = null;
        while (num == null) {
//            System.out.println(message);
            String numAsString = null;

            try {
                num = Integer.parseInt(numAsString);
            } catch (Exception ex) {
                System.out.println(err);
                continue;
            }
            if (num <= 0) {
                System.out.println("Number <= 0");
                num = null;
            }
        }

        return num;
    }

}
