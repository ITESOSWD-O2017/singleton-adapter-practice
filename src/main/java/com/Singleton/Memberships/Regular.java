package com.Singleton.Memberships;
import com.Singleton.Membership;

/**
 * Regular membership.
 */
public class Regular extends Membership {
    /**
     * default constructor.
     */
    public Regular() {
        setMembership("Regular membership");
    }

    /**
     * a.
     * @return membership.
     */
    public final String getMembership() {
        return sendMembership();
    }
    /**
     * Unique instance.
     */
    private static Regular uniqueInstance = new Regular();

    /**
     * regular instance.
     * @return instance.
     */
    public static Regular getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Regular();
        }
        return uniqueInstance;
    }
}
