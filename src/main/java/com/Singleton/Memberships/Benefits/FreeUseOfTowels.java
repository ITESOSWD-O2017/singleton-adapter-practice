package com.Singleton.Memberships.Benefits;
import com.Singleton.Memberships.BenefitsMembership;
import com.Singleton.Membership;

/**
 * Use of towels.
 */
public class FreeUseOfTowels extends BenefitsMembership {
    /**
     * towels.
     */
    private Membership towelsMembership;

    /**
     * default constructor.
     * @param towels a.
     */
    public FreeUseOfTowels(final Membership towels) {
        this.towelsMembership = towels;
    }

    /**
     * a.
     * @return membership.
     */
    public final String getMembership() {
        if (this.towelsMembership != null) {
            return this.towelsMembership.getMembership()
                    + ", free use of towels.";
        } else {
            return "Add your membership type";
        }
    }

    /**
     * a.
     * @return client.
     */
    public final String getClient() {
        return towelsMembership.getMembership() + " towels";
    }
}
