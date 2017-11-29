package com.mycompany.app.Users.users;

public class UserSilver extends User {
    public UserSilver(){
        description = "Usuario plata";
    }

    private static UserSilver uniqueInstance = new UserSilver();
    public static UserSilver getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new UserSilver();
        }
        return uniqueInstance;
    }

    public double price() {
        return 50.0;
    }
}