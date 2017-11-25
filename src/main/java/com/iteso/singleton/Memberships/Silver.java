package com.iteso.singleton.Memberships;

import com.iteso.singleton.Membership;

/**
 * Silver membership class.
 */
public final class Silver extends Membership {
    /**
     * Unique instance.
     */
    private static Silver uniqueInstance = new Silver();

    /**
     * Getting unique Silver instance.
     * @return instance.
     */
    public static Silver getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Silver();
        }
        return uniqueInstance;
    }
    /**
     * Private constructor.
     */
    private Silver() {
        setMembership("Silver Membership");
    }
}
