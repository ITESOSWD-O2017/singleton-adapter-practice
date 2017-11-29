package tiposmembresia;

/**
 *
 */
public abstract class Membresia {
    /**
     *
     */
    private String description;

    /**
     * @return ok
     */
    public final String getDescription() {
        return description;
    }

    /**
     *
     * @param temp asdf
     */
    public final void setDescription(final String temp) {
        description = temp;
    }
    /**
     *
     * @return ok
     */
    public abstract double costo();
    /**
     *
     */
    public Membresia() {
        description  = "Membresia";
    }
}
