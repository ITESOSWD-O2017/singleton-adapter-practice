package com.iteso.Regions;

import com.iteso.Membership;
import com.iteso.Netflix;
import com.iteso.benefits.HD4K;
import com.iteso.benefits.NoRegionBlocker;
import com.iteso.benefits.Recomendations;
import com.iteso.memberships.PantallaHD1;
import com.iteso.memberships.PantallaSD1;
import com.iteso.memberships.PantallasHD2;
import com.iteso.memberships.PantallasHD4;

/**
 * NetflixUSA.
 */
public class NetflixUSA extends Netflix {

    /**
     * Descripcion.
     * @param type Algo
     * @return Retorna una membresía
     */
    public final Membership createMembershipFactory(final String type) {

        Membership membership;

        if (type.equals("PantallaSD1")) {
            membership = new PantallaSD1();
            membership.setBenefit(new HD4K());
        } else if (type.equals("PantallaHD1")) {
            membership = new PantallaHD1();
            membership.setBenefit(new HD4K());
        } else if (type.equals("PantallasHD2")) {
            membership = new PantallasHD2();
            membership.setBenefit(new HD4K());
        } else if (type.equals("PantallasHD4")) {
            membership = new PantallasHD4();
            membership.setBenefit(new HD4K());
        } else {
            membership = null;
        }

        if (membership != null) {
            membership.setBenefit(new NoRegionBlocker());
            membership.setBenefit(new Recomendations());
        }

        return membership;

    }

}
