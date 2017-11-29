package decorator.Membresias;

import decorator.Membresia;

/**
 *
 */
public final class Platinum extends Membresia {
    /**
     *
     */
    static final int COSTO = 1200;
    /**
     *
     */
    static final int DURACION = 10;

    /**
     *
     */
    private static Platinum uniqueInstance;

    /**
     *
     */

    private Platinum() {
        setDescription("Platinum");
    }

    /**
     *
     * @return n
     */
    public static Platinum getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Platinum();
        }
        return uniqueInstance;
    }

    /**
     *
     * @return fffsfd
     */
    public  String getDescription() {
        return "Platino";
    }

    /**
     *
     * @return hv
     */
    @Override
    public  double cost() {
        return COSTO;
    }

    /**
     *
     * @return
     */
    @Override
    public  double duration() {
        return DURACION;
    }
}
