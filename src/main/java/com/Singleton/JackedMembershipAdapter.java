package com.Singleton;

/**
 * class adapter.
 */
public class JackedMembershipAdapter implements JackedMembership {
    /**
     * memberhsip.
     */
    private Membership membership;

    /**
     * constructor.
     * @param oldMembership a.
     */
    public JackedMembershipAdapter(final Membership oldMembership) {
        this.membership = oldMembership;
    }

    /**
     * a.
     * @return client.
     */
    public final String getClient() {
        return membership.getMembership();
    }

    /**
     *a.
     * @return id.
     */
    public final String cancelID() {
        return membership.cancelMembership();
    }

    /**
     * a.
     * @return active.
     */
    public final String activateMembership() {
        return membership.activateMembership();
    }

}

