package com.iteso.singleton.adapter.benefits;

import com.iteso.singleton.adapter.Benefits;
import com.iteso.singleton.adapter.Membership;

/**
 * Created by AlejandraSahagun on 19/11/17.
 */
public class TanningBed extends Benefits {
    /** membership. */
    private Membership membership;
    /** tanningBedCost. */
    private double tanningBedCost = 0;

    /** @return Membership */
    public final Membership getMembership() {
        return membership;
    }

    /** @param m */
    public TanningBed(final Membership m) {
        this.membership = m;
    }

    /** @return String */
    public final String getSubscriber() {
        return membership.getSubscriber();
    }

    /** @return String */
    public final String getDescription() {
        return membership.getDescription() + " with tanning bed";
    }

    /** @return double*/
    public final double cost() {
        return membership.cost() + tanningBedCost;
    }
}
