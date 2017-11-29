package com.mycompany.app.memberships;

import com.mycompany.app.Membership;

/**
 *
 */
public class Gold extends Membership {
    /**
     *  costo de membresía.
     */
    static final double COST = 200.00;

    /**
     *
     * @return unica membresía.
     */
    public static Membership getInstance(){
        if(uniqueInstance == null)
            return new Gold();
        return uniqueInstance;
    }
    /**
     * Constructor.
     */
    public Gold() {
        this.setMembership("Membresía Gold");
    }

    /**
     *
     * @return regresa descripcion.
     */
    @Override
    public final String getDescription() {
        return "Membresía Cinepolis Gold ";
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
