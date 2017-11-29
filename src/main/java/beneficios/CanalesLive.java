package beneficios;

import tiposmembresia.Membresia;
/**
 *
 */
public class CanalesLive extends TipoBeneficio {
    /**
     *
     */
    static final float EXTRA = (float) 1.05;
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
    public CanalesLive(final Membresia mem) {
        membresia = mem;
        String temp = mem.getDescription();
        setDescription(temp + " en vivo");
    }
    @Override
    public final double costo() {
        return membresia.costo() + EXTRA;
    }
}
