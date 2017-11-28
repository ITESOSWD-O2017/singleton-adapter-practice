package com.iteso.singleton.adapter.memberships;

import com.iteso.singleton.adapter.Membership;

/**
 * Created by AlejandraSahagun on 19/11/17.
 */
public final class Platinum extends Membership {
    /** Unique instance. */
    private static Platinum uniqueInstance;
    /** Membership cost. */
    static final double MEMBERSHIP_COST = 25.0;

    /** Private constructor. */
    private Platinum() {
    }

    /** static 'instance' method.
     * @return uniqueInstance */
    public static Membership getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Platinum();
        }
        return uniqueInstance;
    }

    /** @return String. */
    public String getSubscriber() {
        return "Platinum subscriber";
    }

    /** @return String. */
    public String getDescription() {
        return "Platinum membership";
    }

    /** @return double*/
    public double cost() {
        return MEMBERSHIP_COST;
    }
}
