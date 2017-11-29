package beneficios;

import tiposmembresia.Membresia;
/**
 *
 */
public class CanalesHBO extends TipoBeneficio {
    /**
     *
     */
    static final int EXTRA = 20;
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
    public CanalesHBO(final Membresia mem) {
        membresia = mem;
        String temp = mem.getDescription();
        setDescription(temp + " con HBO");
    }
    @Override
    public final double costo() {
        return membresia.costo() + EXTRA;
    }
}
