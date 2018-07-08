package com.fekra.cw.model;

import java.util.List;

public class UserClient {
    private static String username;
    private static String password;
    private static String email;
    private static List<String> favourites;


    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }

    public static String getEmail() {
        return email;
    }

}
