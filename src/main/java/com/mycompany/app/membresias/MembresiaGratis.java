package com.mycompany.app.membresias;

import com.mycompany.app.Membresia;

/**
 * Membresia gratis.
 */
public class MembresiaGratis extends Membresia {

    /**
     * Instancia unica.
     */
    private static MembresiaGratis uniqueInstance = new MembresiaGratis();

    /**
     * Constructor default.
     */
    private MembresiaGratis() {
        this.setDescripcion("Membresia estándar");
    }

    /**
     * Getter instancia unica.
     * @return instancia.
     */
    public static MembresiaGratis getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MembresiaGratis();
        }
        return uniqueInstance;
    }

}
