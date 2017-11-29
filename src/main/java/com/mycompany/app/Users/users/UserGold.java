package com.mycompany.app.Users.users;

public class UserGold extends User {
    public UserGold(){
        description = "Usuario oro";
    }

    private static UserGold uniqueInstance = new UserGold();
    public static UserGold getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new UserGold();
        }
        return uniqueInstance;
    }

    public double price() {
        return 50.0;
    }
}