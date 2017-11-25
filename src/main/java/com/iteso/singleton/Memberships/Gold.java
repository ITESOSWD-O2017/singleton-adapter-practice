package com.iteso.singleton.Memberships;

import com.iteso.singleton.Membership;

/**
 * Gold membership class.
 */
public final class Gold extends Membership {
    /**
     * Unique instance.
     */
    private static Gold uniqueInstance = new Gold();

    /**
     * Getting unique gold instance.
     * @return instance.
     */
    public static Gold getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Gold();
        }
        return uniqueInstance;
    }
    /**
     * Private constructor.
     */
    private Gold() {
        setMembership("Gold Membership");
    }
}
