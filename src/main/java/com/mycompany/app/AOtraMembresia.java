package com.mycompany.app;

/**
 * Adaptador interfaces.
 */
public class AOtraMembresia implements OtraMembresia {

    /**
     * Membresia.
     * */
    private Membresia membresia;

    /**
     * Constructor default.
     * @param inMembresia membresia
     */
    public AOtraMembresia(final Membresia inMembresia) {
        this.membresia =  inMembresia;
    }

    /**
     * Contratar membresia.
     */
    public final void contratarMembresia() {
        membresia.habilitarMembership();
    }

    /**
     * Congelar membresia.
     */
    public final void congelarMembresia() {
        membresia.banearMembership();
    }

    /**
     * Eliminar membresia.
     */
    public final void eliminarMembresia() {
        membresia.deshabilitarMembership();
    }

    /**
     * Getter membresia.
     * @return membresia
     */
    public final String getDescripcion() {
        return membresia.getDescription();
    }
}
