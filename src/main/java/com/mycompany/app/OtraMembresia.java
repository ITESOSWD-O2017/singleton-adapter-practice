package com.mycompany.app;

/**
 * Interfaz adaptador.
 */
public interface OtraMembresia {

    /**
     * Contratar membresia.
     */
    void contratarMembresia();

    /**
     * Congelar membresia.
     */
    void congelarMembresia();

    /**
     * Eliminar mmebresia.
     */
    void eliminarMembresia();

    /**
     * Getter membresia.
     * @return membresia
     */
    String getDescripcion();
}
