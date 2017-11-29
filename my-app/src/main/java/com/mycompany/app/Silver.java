package com.mycompany.app;

public class Silver extends Membership {

    private static Silver uniqueInstance = new Silver();

    public static Silver getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Silver();
        }
        return uniqueInstance;
    }

    private Silver() {
        setMembership("Silver");
    }
}
