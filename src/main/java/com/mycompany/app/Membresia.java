package com.mycompany.app;

/**
 * Clase singleton de membresias.
 */
public abstract class Membresia {

    /**
     *Descripcion de membresia.
     */
    private String description = "Membresia X";

    /**
     *Estatus de la membresia.
     */
    private String status = "Inabilitada";

    /**
     * Getter descripcion.
     * @return Descripcion.
     */
    public final String getDescription() {
        return this.description;
    }

    /**
     * Setter descrpcion.
     * @param inDescription descripcion.
     */
    public final void setDescripcion(final String inDescription) {
        this.description = inDescription;
    }

    /**
     *Getter status.
     * @return Status.
     */
    public final String getStatus() {
        return this.status;
    }

    /**
     *Habilitar membresia.
     */
    public final void habilitarMembership() {
        this.status = "Habilitada";
    }

    /**
     *Deshabilitar membresia.
     */
    public final void deshabilitarMembership() {
        this.status = "Deshabilitada";
    }

    /**
     *Banear membresia.
     */
    public final void banearMembership() {
        this.status = "Baneado";
    }


}
