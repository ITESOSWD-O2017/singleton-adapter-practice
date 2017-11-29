package com.iteso.Memberships;
import com.iteso.Membership;

/**.
 * Metodo
 */
public class SilverMembership extends Membership {

    /** Unique instance. */
    private static SilverMembership uniqueInstance;

    /**.
     * Method
     */
    public SilverMembership() {
        setProperty("Silver membership");
    }

    /** static 'instance' method.
     * @return uniqueInstance */
    public static Membership getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SilverMembership();
        }
        return uniqueInstance;
    }

    /**
     *
     * @return can.
     */
    final String cancelMembership() {
        return "Canceling membership";
    }

    /**
     *
     * @return rev.
     */
    final String revenueMembership() {
        return "Making the revenue of the membership";
    }

    @Override
    public final String getProperties() {
        return sendProperty();
    }


}
