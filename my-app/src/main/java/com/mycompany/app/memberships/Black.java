package com.mycompany.app.memberships;

import com.mycompany.app.Membership;

/**
 *
 */
public class Black extends Membership {
    /**
     *  costo de membresía.
     */
    static final double COST = 100.00;

    /**
     *
     * @return unica membresía.
     */
    public static Membership getInstance() {
        if (uniqueInstance == null)
            return new Black();
        return uniqueInstance;
    }
    /**
     * Constructor.
     */
    private Black() {
        this.setMembership("Membresía Black");
    }

    /**
     *
     * @return regresa descripcion.
     */
    @Override
    public final String getDescription() {
        return "Membresía Cinepolis Black ";
    }

    /**
     *
     * @return regresa el costo.
     */
    @Override
    public final double cost() {
        return COST;
    }
}
