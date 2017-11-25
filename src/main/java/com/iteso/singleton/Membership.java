package com.iteso.singleton;

/**
 * Membership abstract class.
 */
public abstract class Membership {

    /**
    *Property to be set.
    */
    private String membershipType = "Membership";

    /**
     *Membership status.
     */
    private String membershipStatus = "Active";
    /**
     * Getting a property.
     * @return property.
     */
    public final String getMembershipType() {
        return this.membershipType;
    }

    /**
     * Getting a property.
     * @param type setting property.
     * @return end.
     */
    public final String setMembership(final String type) {
        this.membershipType = type;
        return "Membership has been created";
    }

    /**
     *Cancelling membership.
     * @return cancellation string.
     */
    public final String activateMembership() {
        this.membershipStatus = "Active";
        return "The " + this.membershipType + " has been activated";
    }

    /**
     *Cancelling membership.
     * @return cancellation string.
     */
    public final String cancelMembership() {
        this.membershipStatus = "Cancelled";
        return "The " + this.membershipType + " has been cancelled";
    }

    /**
     *Getting status.
     * @return status.
     */
    public final String getMembershipStatus() {
        return this.membershipStatus;
    }


}
