package com.mycompany.app.membresias;

import com.mycompany.app.Membresia;

/**
 * Membresia ultra.
 */
public final class MembresiaUltra extends Membresia {

    /**
     * Instancia unica.
     */
    private static MembresiaUltra uniqueInstance = new MembresiaUltra();

    /**
     * Constructor default.
     */
    private MembresiaUltra() {
        this.setDescripcion("Membresia estándar");
    }

    /**
     * Getter instancia unica.
     * @return instancia.
     */
    public static MembresiaUltra getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MembresiaUltra();
        }
        return uniqueInstance;
    }
}
