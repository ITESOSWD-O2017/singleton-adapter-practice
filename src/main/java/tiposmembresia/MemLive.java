package tiposmembresia;

/**
 *
 */
public final class MemLive extends Membresia {
    /**
     *
     */
    private static MemLive instance = new MemLive();

    /**
     *
     * @return instancia
     */
    public static MemLive getInstance() {
        return instance;
    }
    /**
     *
     */
    static final float EXTRA = (float) 19.99;
    /**
     *
     */
    private MemLive() {
        String temp = getDescription();
        setDescription(temp + " | Live");
    }
    /**
     *
     * @return ok
     */
    public double costo() {
        return EXTRA;
    }
}
