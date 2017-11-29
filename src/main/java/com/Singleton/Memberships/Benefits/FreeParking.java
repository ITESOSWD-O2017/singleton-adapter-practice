package com.Singleton.Memberships.Benefits;
import com.Singleton.Memberships.BenefitsMembership;
import com.Singleton.Membership;

/**
 * Class Parking.
 */
public class FreeParking extends BenefitsMembership {
    /**
     * parking.
     */
    private Membership parking;

    /**
     * default constructor.
     * @param parkings a.
     */
    public FreeParking(final Membership parkings) {
        this.parking = parkings;
    }

    /**
     * a.
     * @return membership.
     */
    public final String getMembership() {
        if (this.parking != null) {
            return this.parking.getMembership() + ", free parking!";
        } else {
            return "Add your membership type";
        }
    }

    /**
     * a.
     * @return client.
     */
    public final String getClient() {
        return parking.getMembership() + " parking";
    }
}

