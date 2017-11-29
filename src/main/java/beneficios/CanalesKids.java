package beneficios;

import tiposmembresia.Membresia;
/**
 *
 */
public class CanalesKids extends TipoBeneficio {
    /**
     *
     */
    static final float EXTRA = (float) .55;
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
    public CanalesKids(final Membresia mem) {
        membresia = mem;
        String temp = mem.getDescription();
        setDescription(temp + " para niños");
    }
    @Override
    public final double costo() {
        return membresia.costo() + EXTRA;
    }
}
