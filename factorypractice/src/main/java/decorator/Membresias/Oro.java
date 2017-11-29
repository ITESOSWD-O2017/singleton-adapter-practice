package decorator.Membresias;

import decorator.Membresia;

/**
 *
 */
public final class Oro extends Membresia {
    /**
     *
     */
    static final int COSTO = 1100;
    /**
     *
     */
    static final int DURACION = 12;

    /**
     *
     */
    private static Oro uniqueInstanceOro;

    /**
     *
     */

    private Oro() {
        setDescription("Oro");
    }

    /**
     *
     * @return d
     */
    public static Oro getUniqueInstance() {
        if (uniqueInstanceOro == null) {
            uniqueInstanceOro = new Oro();
        }
        return uniqueInstanceOro;
    }

    /**
     *
     * @return fff
     */
    public  String getDescription() {
        return "Oro";
    }

    /**
     *
     * @return fffff
     */
    @Override
    public  double cost() {
        return COSTO;
    }

    /**
     *
     * @return fffffff
     */
    @Override
    public  double duration() {
        return DURACION;
    }
}

