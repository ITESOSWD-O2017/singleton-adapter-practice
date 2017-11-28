package com.iteso.singleton.adapter.memberships;

import com.iteso.singleton.adapter.Membership;

/**
 * Created by AlejandraSahagun on 19/11/17.
 */
public final class Bronze extends Membership {
    /** Unique instance. */
    private static Bronze uniqueInstance;
    /** Membership cost. */
    static final double MEMBERSHIP_COST = 10.0;

    /** private constructor. */
    private Bronze() {
    }

    /** static 'instance' method.
     * @return uniqueInstance */
    public static Membership getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Bronze();
        }
        return uniqueInstance;
    }

    /** @return String. */
    public String getSubscriber() {
        return "Bronze subscriber";
    }

    /** @return String. */
    public String getDescription() {
        return "Bronze membership";
    }

    /** @return double*/
    public double cost() {
        return MEMBERSHIP_COST;
    }
}
