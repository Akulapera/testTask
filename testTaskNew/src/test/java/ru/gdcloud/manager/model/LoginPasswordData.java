package ru.gdcloud.manager.model;

public class LoginPasswordData {
    private  String login;
    private String password;

    public LoginPasswordData setLogin(String login) {
        this.login = login;
        return this;
    }

    public LoginPasswordData setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
