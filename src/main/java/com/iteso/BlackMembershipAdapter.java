package com.iteso;

/**.
 * class
 */
public class BlackMembershipAdapter implements BlackMembership {

    /**
     * */
    private Membership oldMembership;

    /** Constructor.
     * @param oldMem old */
    public BlackMembershipAdapter(final Membership oldMem) {

        this.oldMembership = oldMem;
    }

    /**
     * @return rev.
     * */
    public final String revenueMembership() {
        return oldMembership.revenueMembership();
    }
    /**
     * @return can.
     * */
    public final String cancelMembership() {
        return oldMembership.cancelMembership();
    }
    /**
     * @return chan.
     * */
    public final String changeMembershipOwner() {
        return oldMembership.changeMembershipOwner();
    }

}
