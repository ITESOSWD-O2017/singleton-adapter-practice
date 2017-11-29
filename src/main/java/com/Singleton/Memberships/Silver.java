package com.Singleton.Memberships;
import com.Singleton.Membership;

/**
 * Class Silver membership.
 */
public class Silver extends Membership {
    /**
     * default constructor.
     */
    public Silver() {
        setMembership("Silver membership");
    }

    /**
     * a.
     * @return memberhsip.
     */
    public final String getMembership() {
        return sendMembership();
    }
    /**
     * Unique instance.
     */
    private static Silver uniqueInstance = new Silver();

    /**
     * silver instance.
     * @return instance.
     */
    public static Silver getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Silver();
        }
        return uniqueInstance;
    }
}
