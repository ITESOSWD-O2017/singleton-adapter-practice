package tiposmembresia;

/**
 *
 */
public final class MemBasic extends Membresia {
    /**
     *
     */
    private static MemBasic instance = new MemBasic();

    /**
     *
     * @return instancia
     */
    public static MemBasic getInstance() {
        return instance;
    }
    /**
     *
     */
    static final float EXTRA = (float) 9.99;
    /**
     *
     */
    private MemBasic() {
        String temp = getDescription();
        setDescription(temp + " | Normal");
    }
    /**
     *
     * @return ok
     */
    public  double costo() {
        return EXTRA;
    }
}
