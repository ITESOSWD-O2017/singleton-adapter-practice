package beneficios;

import tiposmembresia.Membresia;
/**
 *
 */
public class CanalesRegulares extends TipoBeneficio {
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
    public CanalesRegulares(final Membresia mem) {
        membresia = mem;
        String temp = mem.getDescription();
        setDescription(temp + " con tv abierta");
    }
    @Override
    public final double costo() {
        return membresia.costo();
    }

}
