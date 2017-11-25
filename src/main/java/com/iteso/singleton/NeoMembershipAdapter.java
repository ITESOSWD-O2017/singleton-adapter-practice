package com.iteso.singleton;
/**
 * Neo Membership adapter to normal memberships.
 */
public class NeoMembershipAdapter implements NeoMembership {
    /**
     * Membership to be adapted.
    * */
    private Membership membership;
    /**
     * Constructor.
     * @param oldMembership membership to convert.
     * */
    public NeoMembershipAdapter(final Membership oldMembership) {
        this.membership =  oldMembership;
    }

    @Override
    public final String hireMembership() {
        return membership.activateMembership();
    }

    @Override
    public final String freezeMembership() {
        return membership.cancelMembership();
    }

    @Override
    public final String getMembershipName() {
        return membership.getMembershipType();
    }
}
