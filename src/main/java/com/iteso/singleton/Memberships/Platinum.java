package com.iteso.singleton.Memberships;

import com.iteso.singleton.Membership;


/**
 * Platinum membership class.
 */
public final class Platinum extends Membership {
    /**
     * Unique instance.
     */
    private static Platinum uniqueInstance = new Platinum();

    /**
     * Getting unique platinum instance.
     * @return instance.
     */
    public static Platinum getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Platinum();
        }
        return uniqueInstance;
    }
    /**
     * Private constructor.
     */
    private Platinum() {
        setMembership("Platinum Membership");
    }
}
