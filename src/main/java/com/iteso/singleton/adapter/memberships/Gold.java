package com.iteso.singleton.adapter.memberships;

import com.iteso.singleton.adapter.Membership;

/**
 * Created by AlejandraSahagun on 19/11/17.
 */
public final class Gold extends Membership {
    /** Unique instance. */
    private static Gold uniqueInstance;
    /** Membership cost. */
    static final double MEMBERSHIP_COST = 20.0;

    /** Private constructor. */
    private Gold() {
    }

    /** static 'instance' method.
     * @return uniqueInstance */
    public static Membership getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Gold();
        }
        return uniqueInstance;
    }

    /** @return String. */
    public String getSubscriber() {
        return "Gold subscriber";
    }

    /** @return String. */
    public String getDescription() {
        return "Gold membership";
    }

    /** @return double*/
    public double cost() {
        return MEMBERSHIP_COST;
    }
}
