package com.Singleton.Memberships;
import com.Singleton.Membership;

/**
 * Gold membership.
 */
public final class Gold extends Membership {
    /**
     * default constructor.
     */
    private Gold() {
        setMembership("Gold membership");
    }

    @Override
    public String getMembership() {
        return sendMembership();
    }
    /**
     * Unique instance.
     */
    private static Gold uniqueInstance = new Gold();

    /**
     * gold instance.
     * @return instance.
     */
    public static Gold getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Gold();
        }
        return uniqueInstance;
    }
}
