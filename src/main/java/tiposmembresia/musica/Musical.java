package tiposmembresia.musica;

/**
 *
 */
public final class Musical {
    /**
     *
     */
    private static final  Musical INSTANCE = new Musical();

    /**
     *
     * @return instancia
     */
    public static Musical getInstance() {
        return INSTANCE;
    }

    /**
     *
     */
    private static final  int COSTO = 30;
    /**
     *
     * @return costo
     */
    public double costo() {
        return COSTO;
    }

    /**
     *
     */
    private String titular;
    /**
     *
     */
    private int cuenta;
    /**
     *
     */
    private String vencimiento;
    /**
     *
     * @return titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     *
     * @return centa
     */
    public int getCuenta() {
        return cuenta;
    }

    /**
     *
     * @return vencimiento
     */
    public String getVencimiento() {
        return vencimiento;
    }

    /**
     *
     */
    private Musical() {
        titular = "Spotify";
        cuenta = 001;
        vencimiento = "1/04/19";
    }
}
