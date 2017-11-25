package com.iteso.singleton.Memberships;

import com.iteso.singleton.Membership;

/**
 * Normal membership class.
 */
public final class Normal extends Membership {
    /**
     * Unique instance.
     */
    private static Normal uniqueInstance = new Normal();

    /**
     * Getting unique Normal instance.
     * @return instance.
     */
    public static Normal getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Normal();
        }
        return uniqueInstance;
    }
    /**
     * Private constructor.
     */
    private Normal() {
        activateMembership();
        setMembership("Normal Membership");
    }
}
