package com.iteso.singleton.adapter.memberships;

import com.iteso.singleton.adapter.Membership;

/**
 * Created by AlejandraSahagun on 19/11/17.
 */
public final class Silver extends Membership {
    /** Unique instance. */
    private static Silver uniqueInstance;
    /** Membership cost. */
    static final double MEMBERSHIP_COST = 15.0;

    /** Private constructor. */
    private Silver() {
    }

    /** static 'instance' method.
     * @return uniqueInstance */
    public static Membership getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Silver();
        }
        return uniqueInstance;
    }

    /** @return String. */
    public String getSubscriber() {
        return "Silver subscriber";
    }

    /** @return String. */
    public String getDescription() {
        return "Silver membership";
    }

    /** @return double*/
    public double cost() {
        return MEMBERSHIP_COST;
    }
}
