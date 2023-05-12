package org.example;

import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class ExceptionsTest  {
    private String login;
    private String password;
    private String confirmPassword;

    public ExceptionsTest(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static void test(String login, String password, String confirmPassword) {
        if (login.length() > 20) {
            throw new WrongLoginException("Слишком длинный логин");
        }
        if (password.length() > 20) {
            throw new WrongPasswordException("Слишком длинный пароль");
        }
        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("Пароль не совпадает");
        }
    }
}
