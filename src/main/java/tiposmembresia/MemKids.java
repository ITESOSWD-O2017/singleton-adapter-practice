package tiposmembresia;

/**
 *
 */
public final class MemKids extends Membresia {
    /**
     *
     */
    private static MemKids instance = new MemKids();

    /**
     *
     * @return instancia
     */
    public static MemKids getInstance() {
        return instance;
    }
    /**
     *
     */
    static final float EXTRA = (float) 5.99;

    /**
     *
     */
    private MemKids() {
        String temp = getDescription();
        setDescription(temp + " | Kids");
    }

    /**
     *
     * @return ok
     */
    public double costo() {
        return EXTRA;
    }
}
