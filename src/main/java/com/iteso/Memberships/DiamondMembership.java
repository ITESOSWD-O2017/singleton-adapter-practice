package com.iteso.Memberships;
import com.iteso.Membership;

/**.
 * Class diamond
 */
public class DiamondMembership extends Membership {

    /** Unique instance. */
    private static DiamondMembership uniqueInstance;

    /**.
     * Propiedad
     */
    public DiamondMembership() {
        setProperty("Diamond membership");
    }


    /** static 'instance' method.
     * @return uniqueInstance */
    public static Membership getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new DiamondMembership();
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
