package com.mycompany.app;

public class Platinum extends Membership {
    private static Platinum uniqueInstance = new Platinum();

    public static Platinum getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Platinum();
        }
        return uniqueInstance;
    }

    private Platinum() {
        setMembership("Platinum");
    }

}
