package com.iteso.Memberships;
import com.iteso.Membership;

/**.
 * Class bronce
 */
public class BronceMembership extends Membership {

    /** Unique instance. */
    private static BronceMembership uniqueInstance;

    /**.
     * Set propiedad
     */
    public BronceMembership() {
        setProperty("Bronce membership");
    }

    /** static 'instance' method.
     * @return uniqueInstance */
    public static Membership getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new BronceMembership();
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
