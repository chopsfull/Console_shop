package domain;

import java.util.ArrayList;
import java.util.List;

public class Profile {
    private String login, password;
    private List<String> productsPurchased = new ArrayList<>();
    private double balance = 0;

    public Profile(){}

    public Profile(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getLogin() {

        return login;
    }

    public String getPassword() {
        return password;
    }

    public List<String> getProductsPurchased() {
        return productsPurchased;
    }

    public double getBalance() {
        return balance;
    }
}
