package com.mycompany.app;

public class Daimond extends Membership {

    private static Daimond uniqueInstance = new Daimond();

    public static Daimond getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Daimond();
        }
        return uniqueInstance;
    }

    private Daimond() {
        setMembership("Daimond");
    }
}
