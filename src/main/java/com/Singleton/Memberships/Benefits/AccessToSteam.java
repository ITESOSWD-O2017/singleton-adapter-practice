package com.Singleton.Memberships.Benefits;
import com.Singleton.Memberships.BenefitsMembership;
import com.Singleton.Membership;

/**
 * Class Steam.
 */
public class AccessToSteam extends BenefitsMembership {
    /**
     * towels.
     */
    private Membership steam;

    /**
     * default constructor.
     * @param steams a.
     */
    public AccessToSteam(final Membership steams) {
        this.steam = steams;
    }

    /**
     * a.
     * @return membership.
     */
    public final String getMembership() {
        if (this.steam != null) {
            return this.steam.getMembership();
        } else {
            return "Add your membership type";
        }
    }
    /**
     * a.
     * @return client.
     */
    public final String getClient() {
        return steam.getMembership() + " steam";
    }
}
