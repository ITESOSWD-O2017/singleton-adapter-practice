package com.Singleton;

/**
 * Membership class.
 *
 */
public abstract class Membership {

    /**user.
     */
    private String membershipUser = "User";
    /**
     *Membership status.
     */
    private String membershipStatus = "Active";
    /**
     * a.
     * @return membership.
     */
    public abstract String getMembership();

    /**
     * a.
     * @param membership membership.
     */
    public final void setMembership(final String membership) {
        this.membershipUser = membership;
    }
    /**
     * Getting a membership.
     * @return end.
     */
    public final String sendMembership() {
        return this.membershipUser;
    }
    /**
     *a.
     * @return status.
     */
    public final String getMembershipStatus() {
        return this.membershipStatus;
    }

    /**
     *Cancelling membership.
     * @return cancellation string.
     */
    public final String activateMembership() {
        this.membershipStatus = "Active";
        return this.membershipUser + " has been activated";
    }

    /**
     *Cancelling membership.
     * @return cancellation string.
     */
    public final String cancelMembership() {
        this.membershipStatus = "Cancelled";
        return this.membershipUser + " has been cancelled";
    }

}
