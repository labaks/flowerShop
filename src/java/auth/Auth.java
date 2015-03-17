package auth;

public class Auth {

    private static boolean authImpl(User user) {
        final String LOGIN = "qqq";
        final String PASS = "111";
        return LOGIN.equals(user.getLogin()) && PASS.equals(user.getPass());
    }

    public static boolean auth(User user) {
        final User checkUser = new User();
        checkUser.setLogin(user.getLogin());
        checkUser.setPass(user.getPass());
        return authImpl(checkUser);
    }
}
