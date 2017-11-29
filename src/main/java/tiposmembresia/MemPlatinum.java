package tiposmembresia;

/**
 *
 */
public final class MemPlatinum extends Membresia {
    /**
     *
     */
    private static MemPlatinum instance = new MemPlatinum();

    /**
     *
     * @return instancia
     */
    public static MemPlatinum getInstance() {
        return instance;
    }
    /**
     *
     */
    static final float EXTRA = (float) 39.99;
    /**
     *
     */
    private MemPlatinum() {
        String temp = getDescription();
        setDescription(temp + " | Plat");
    }
    /**
     *
     * @return ok
     */
    public double costo() {
        return EXTRA;
    }
}
