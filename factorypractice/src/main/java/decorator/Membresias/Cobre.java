package decorator.Membresias;

import decorator.Membresia;

/**
 *
 */
public final class Cobre extends Membresia {
    /**
     *
     */
    static final int DURACION = 9999;

    /**
     *
     */
    private static Cobre uniqueInstance;

    /**
     *
     */

    private Cobre() {
        setDescription("Cobre");
    }

    /**
     *
     * @return d
     */
    public static Cobre getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Cobre();
        }
        return uniqueInstance;
    }

    /**
     *
     * @return f
     */
    public  String getDescription() {
        return "Cobre";
    }


    /**
     *
     * @return f
     */
    @Override
    public  double cost() {
        return 0;
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
