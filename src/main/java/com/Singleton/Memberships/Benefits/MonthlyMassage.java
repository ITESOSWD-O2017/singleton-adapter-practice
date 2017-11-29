package com.Singleton.Memberships.Benefits;
import com.Singleton.Memberships.BenefitsMembership;
import com.Singleton.Membership;

/**
 * Class Monthly Massage.
 */
public class MonthlyMassage extends BenefitsMembership {
    /**
     * massage.
     */
    private Membership massage;

    /**
     * default constructor.
     * @param massages a.
     */
    public MonthlyMassage(final Membership massages) {
        this.massage = massages;
    }

    /**
     * a.
     * @return memberhsip.
     */
    public final String getMembership() {
        if (this.massage != null) {
            return this.massage.getMembership() + ", monthly massage.";
        } else {
            return "Add your membership type";
        }
    }

    /**
     * a.
     * @return client.
     */
    public final String getClient() {
        return massage.getMembership() + " massage";
    }
}
