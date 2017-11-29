package com.iteso;

import com.iteso.memberships.Benefits;

/**
 * SecondMembership.
 */
public class MembershipAdapter implements SecondMembership {

    /**
     * OldMembership.
     */
    private Membership firstMembership;

    /**
     * MembershipAdapter.
     * @param member membership
     */
    public MembershipAdapter(final Membership member) {
        this.firstMembership = member;
    }

    /**
     * GetName.
     * @return return String
     */
    public final String getName() {
        return firstMembership.getUser();
    }

    /**
     * GetAll.
     * @return return String
     */
    public final String getAll() {
        return "Todas las características "
                 + firstMembership.getCharacteristics();
    }

    /**
     *
     * @param settingBenefit benefit
     * @return a string
     */
    public final String pushBenefit(final Benefits settingBenefit) {
        firstMembership.setBenefit(settingBenefit);
        return firstMembership.getBenefits();
    }
}
