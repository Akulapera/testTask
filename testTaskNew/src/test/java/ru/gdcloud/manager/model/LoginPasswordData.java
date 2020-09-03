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

    @Override
    public String toString() {
        return "LoginPasswordDataTOSTRING{" +
                "login is='" + login + '\'' +
                ", password is='" + password + '\'' +
                '}';
    }
    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
