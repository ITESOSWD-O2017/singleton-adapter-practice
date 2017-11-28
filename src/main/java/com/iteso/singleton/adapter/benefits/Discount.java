package com.iteso.singleton.adapter.benefits;

import com.iteso.singleton.adapter.Benefits;
import com.iteso.singleton.adapter.Membership;

/**
 * Created by AlejandraSahagun on 19/11/17.
 */
public class Discount extends Benefits {
    /** membership. */
    private Membership membership;

    /** discount. */
    private double discount = 0;

    /** @return Membership */
    public final Membership getMembership() {
        return membership;
    }

    /** @return discount */
    public final double getDiscount() {
        return discount;
    }

    /** @param m */
    public Discount(final Membership m) {
        this.membership = m;
    }

    /** @return String */
    public final String getSubscriber() {
        return membership.getSubscriber();
    }

    /** @return String */
    public final String getDescription() {
        return membership.getDescription() + " with discount";
    }

    /** @return double*/
    public final double cost() {
        return membership.cost() - (membership.cost() * discount);
    }
}
