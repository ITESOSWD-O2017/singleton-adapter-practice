package beneficios;

import tiposmembresia.Membresia;
/**
 *
 */
public class CanalesNaturales extends TipoBeneficio {
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
    public CanalesNaturales(final Membresia mem) {
        membresia = mem;
        String temp = mem.getDescription();
        setDescription(temp + " con perritos");
    }
    @Override
    public final double costo() {
        return membresia.costo();
    }
}
