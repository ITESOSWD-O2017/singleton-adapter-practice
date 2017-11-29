package decorator.Membresias;

import decorator.Membresia;

/**
 *
 */
public final class Bronce extends Membresia {
    /**
     *
     */
    static final int COSTO = 400;
    /**
     *
     */
    static final int DURACION = 3;

    /**
     *
     */
    private static Bronce uniqueInstance;

    /**
     *
     */

    private Bronce() {
        setDescription("Bronce");
    }

    /**
     *
     * @return ff
     */
    public static Bronce getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Bronce();
        }
        return uniqueInstance;
    }

    /**
     *
     * @return f
     */
    public  String getDescription() {
        return "Bronce";
    }

    /**
     *
     * @return f
     */
    @Override
    public  double cost() {
        return COSTO;
    }

    /**
     *
     * @return f
     */
    @Override
    public  double duration() {
        return DURACION;
    }
}
