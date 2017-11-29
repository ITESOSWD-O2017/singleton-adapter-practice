package com.mycompany.app.Users.users;

public class UserNormal extends User {
    public UserNormal(){
        description = "Usuario común";
    }

    private static UserNormal uniqueInstance = new UserNormal();
    public static UserNormal getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new UserNormal();
        }
        return uniqueInstance;
    }

    public double price() {
        return 50.0;
    }
}
