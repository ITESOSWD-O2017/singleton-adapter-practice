package com.Singleton.Memberships;
import com.Singleton.Membership;

/**
 * Platinum membership.
 */
public final class Platinum extends Membership {
    /**
     * default constructor.
     */
    private Platinum() {
        setMembership("Platinum membership");
    }

    @Override
    public String getMembership() {
        return sendMembership();
    }

    /**
     * Unique instance.
     */
    private static Platinum uniqueInstance = new Platinum();

    /**
     * platinum instance.
     * @return instance.
     */
    public static Platinum getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Platinum();
        }
        return uniqueInstance;
    }
}
