package Main;

import auth.Auth;
import auth.User;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class Main {

    private User user = new User();
    boolean authComplite;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isAuthComplite() {
        return authComplite;
    }

    public void auth() {

        authComplite = Auth.auth(user);

    }

}
