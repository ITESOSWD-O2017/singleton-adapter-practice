package com.mycompany.app;

public class Gold extends Membership{
    private static Gold uniqueInstance = new Gold();

    public static Gold getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Gold();
        }
        return uniqueInstance;
    }

    private Gold() {
        setMembership("Gold");
    }
}
