package com.iteso.singleton.adapter;

/**
 * Created by AlejandraSahagun on 27/11/17.
 */
public class CoolMembershipAdapter implements CoolMembership {
    /** */
    private Membership oldMembership;

    /** Constructor.
     * @param oldMem old membership */
    public CoolMembershipAdapter(final Membership oldMem) {
        this.oldMembership = oldMem;
    }

    /** @return subscriber. */
    public final String getSubscriber() {
        return oldMembership.getSubscriber();
    }
    /** @return credential. */
    public final String printCredential() {
        return oldMembership.printCredential();
    }
    /** @return benefits. */
    public final String addBenefits() {
        return oldMembership.getDescription();
    }
}
