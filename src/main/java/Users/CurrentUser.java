package Users;

public class CurrentUser {
    public static String name;
    public static String login;
    public static String password;

    public CurrentUser() {

    }


    public CurrentUser(String login, String password, String name) {
        this.login = login;
        this.name = name;
        this.password = password;

    }

    public static String getPassword() {
        return password;
    }

    public static String getName() {
        return name;
    }

    public static String getLogin(){
        return login;
    }

}
