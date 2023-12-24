package Users;

import Bank.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class Users {
    String name;
    String login;
    String password;

    public Users() {

    }


    public Users(String login, String password, String name) {
        this.login = login;
        this.name = name;
        this.password = password;

    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;

    }
}
