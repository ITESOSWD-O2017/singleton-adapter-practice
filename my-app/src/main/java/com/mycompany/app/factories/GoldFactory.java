package com.mycompany.app.factories;

import com.mycompany.app.MemberStore;
import com.mycompany.app.Membership;
import com.mycompany.app.benefits.Boletos2x1;
import com.mycompany.app.benefits.CortesiaNormal;
import com.mycompany.app.benefits.Cortesia3D;
import com.mycompany.app.benefits.CortesiaVIP;
import com.mycompany.app.benefits.Nachos2x1;
import com.mycompany.app.benefits.PalomitasGratis;
import com.mycompany.app.benefits.PasePreferencial;
import com.mycompany.app.benefits.ComboGratis;
import com.mycompany.app.memberships.Gold;

/**
 *
 */
public class GoldFactory extends MemberStore {
    /**
     *
     * @return la membresia Gold ya creada.
     */
    @Override
    protected final Membership createMemFactory() {
        Membership mem = Gold.getInstance();
        mem = new Boletos2x1(mem);
        mem = new CortesiaNormal(mem);
        mem = new Cortesia3D(mem);
        mem = new CortesiaVIP(mem);
        mem = new Nachos2x1(mem);
        mem = new PalomitasGratis(mem);
        mem = new PasePreferencial(mem);
        mem = new ComboGratis(mem);
        return mem;
    }
}
