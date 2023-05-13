package org.example;

import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

import static org.example.ExceptionsTest.test;

public class Main {
    public static void main(String[] args) {

        try {
            test("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}