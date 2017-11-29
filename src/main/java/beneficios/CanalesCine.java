package beneficios;

import tiposmembresia.Membresia;
/**
 *
 */
public class CanalesCine extends TipoBeneficio {
    /**
     *
     */
    private Membresia membresia;
    /**
     *@return ok
     */
    public final Membresia getMembresia() {
        return membresia;
    }
    /**
     *@param mem This is a parameter
     */
    public CanalesCine(final Membresia mem) {
        membresia = mem;
        String temp = mem.getDescription();
        setDescription(temp + " con peliculas");
    }
    @Override
    public final double costo() {
        return membresia.costo();
    }
}
