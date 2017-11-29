package com.Singleton.Memberships.Benefits;
import com.Singleton.Memberships.BenefitsMembership;
import com.Singleton.Membership;

/**
 * class Protein shake.
 */
public class ProteinShake extends BenefitsMembership {
    /**
     * shake.
     */
    private Membership shake;

    /**
     * default constructor.
     * @param shakes a.
     */
    public ProteinShake(final Membership shakes) {
        this.shake = shakes;
    }

    /**
     * a.
     * @return membership.
     */
    public final String getMembership() {
        if (this.shake != null) {
            return this.shake.getMembership() + ", free monthly protein shake.";
        } else {
            return "Add your membership type";
        }
    }
    /**
     * a.
     * @return client.
     */
    public final String getClient() {
        return shake.getMembership() + " shake";
    }
}
