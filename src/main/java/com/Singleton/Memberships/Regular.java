package com.Singleton.Memberships;
import com.Singleton.Membership;

/**
 * Regular membership.
 */
public final class Regular extends Membership {
    /**
     * default constructor.
     */
    private Regular() {
        setMembership("Regular membership");
    }

    /**
     * a.
     * @return membership.
     */
    public String getMembership() {
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
