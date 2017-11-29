package com.iteso.Memberships;
import com.iteso.Membership;

/**.
 * Class gold
 */
public class GoldMembership extends Membership {

    /** Unique instance. */
    private static GoldMembership uniqueInstance;
    /**.
     * Method
     */
    public GoldMembership() {
        setProperty("Gold membership");
    }

    /** static 'instance' method.
     * @return uniqueInstance */
    public static Membership getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new GoldMembership();
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
