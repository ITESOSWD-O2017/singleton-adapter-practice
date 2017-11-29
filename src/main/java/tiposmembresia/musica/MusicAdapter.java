package tiposmembresia.musica;

import tiposmembresia.Membresia;

/**
 *
 */
public class MusicAdapter extends Membresia {
    /**
     *
     */
    private final Musical musical = Musical.getInstance();
    /**
     *
     * @return musical
     */
    public final Musical getMusical() {
        return musical;
    }
    /**
     *
     * @return ok
     */
    public final double costo() {
        return musical.costo();
    }

    /**
     *
     */
    public MusicAdapter() {
        String temp = musical.getTitular()
                + ", Cuenta: " + musical.getCuenta()
                + ", Vencimiento: " + musical.getVencimiento();
        setDescription(getDescription() + " | " + temp + " | ");
    }
}
