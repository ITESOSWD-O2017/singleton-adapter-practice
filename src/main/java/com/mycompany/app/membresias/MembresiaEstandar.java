package com.mycompany.app.membresias;

import com.mycompany.app.Membresia;

/**
 * Membresia estandar.
 */
public final class MembresiaEstandar extends Membresia {

    /**
     * Instancia unica.
     */
    private static MembresiaEstandar uniqueInstance = new MembresiaEstandar();

    /**
     * Constructor default.
     */
    private MembresiaEstandar() {
        this.setDescripcion("Membresia estándar");
    }

    /**
     * Getter instancia unica.
     * @return instancia.
     */
    public static MembresiaEstandar getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MembresiaEstandar();
        }
        return uniqueInstance;
    }

}
