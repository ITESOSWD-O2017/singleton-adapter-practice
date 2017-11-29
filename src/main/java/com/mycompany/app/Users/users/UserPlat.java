package com.mycompany.app.Users.users;

public class UserPlat extends User {
    public UserPlat(){
        description = "Usuario platino";
    }

    private static UserPlat uniqueInstance = new UserPlat();
    public static UserPlat getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new UserPlat();
        }
        return uniqueInstance;
    }

    public double price() {
        return 50.0;
    }
}