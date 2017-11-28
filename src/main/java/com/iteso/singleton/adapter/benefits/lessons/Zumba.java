package com.iteso.singleton.adapter.benefits.lessons;

import com.iteso.singleton.adapter.Benefits;
import com.iteso.singleton.adapter.Membership;

/**
 * Created by AlejandraSahagun on 19/11/17.
 */
public class Zumba extends Benefits {
    /** membership. */
    private Membership membership;
    /** zumbaCost. */
    private double zumbaCost = 0;

    /** @return Membership */
    public final Membership getMembership() {
        return membership;
    }

    /** @param m */
    public Zumba(final Membership m) {
        this.membership = m;
    }

    /** @return String */
    public final String getSubscriber() {
        return membership.getSubscriber();
    }

    /** @return String */
    public final String getDescription() {
        return membership.getDescription() + " with zumba classes";
    }

    /** @return double*/
    public final double cost() {
        return membership.cost() + zumbaCost;
    }
}
