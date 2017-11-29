package com.mycompany.app.membresias;

import com.mycompany.app.Membresia;

/**
 * Membresia HD.
 */
public final class MembresiaHD extends Membresia {

    /**
     * Instancia unica.
     */
    private static MembresiaHD uniqueInstance = new MembresiaHD();

    /**
     * Constructor default.
     */
    private MembresiaHD() {
        this.setDescripcion("Membresia estándar");
    }

    /**
     * Getter instancia unica.
     * @return instancia.
     */
    public static MembresiaHD getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MembresiaHD();
        }
        return uniqueInstance;
    }
}
