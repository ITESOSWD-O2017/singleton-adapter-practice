package decorator.Membresias;

import decorator.Membresia;

/**
 *
 */
public final class Plata extends Membresia {
    /**
     *
     */
    static final int COSTO = 600;
    /**
     *
     */
    static final int DURACION = 3;

    /**
     *
     */
    private static Plata uniqueInstance;

    /**
     *
     */

    private Plata() {
        setDescription("Plata");
    }

    /**
     *
     * @return d
     */
    public static Plata getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Plata();
        }
        return uniqueInstance;
    }

    /**
     *
     * @return ffff
     */
    public  String getDescription() {
        return "Plata";
    }

    /**
     *
     * @return ffffffff
     */
    @Override
    public  double cost() {
        return COSTO;
    }

    /**
     *
     * @return ffffff
     */
    @Override
    public  double duration() {
        return DURACION;
    }
}
