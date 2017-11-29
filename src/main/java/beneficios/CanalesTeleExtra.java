package beneficios;

import tiposmembresia.Membresia;
/**
 *
 */
public class CanalesTeleExtra extends TipoBeneficio {
    /**
     *
     */
    static final float EXTRA = (float) 7.75;
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
    public CanalesTeleExtra(final Membresia mem) {
        membresia = mem;
        String temp = mem.getDescription();
        setDescription(temp + " con tv extra");
    }
    @Override
    public final double costo() {
        return membresia.costo() + EXTRA;
    }

}
