package control;

import beneficios.CanalesCine;
import beneficios.CanalesHBO;
import tiposmembresia.MemLive;
import tiposmembresia.MemPlatinum;
import tiposmembresia.Membresia;
import factories.AmericaStore;
import factories.MxStore;
import tiposmembresia.musica.MusicAdapter;

/**
 *
 */
public final class SetUpPlan {
    /**
     *
     */
    private SetUpPlan() {  }
    /**
     *
     * @param args This is a parameter
     */
    public static void main(final String[] args) {
        Membresia membresia = MemPlatinum.getInstance();
        membresia = new CanalesCine(membresia);
        System.out.println(membresia.getDescription());
        AmericaStore store = new AmericaStore();
        Membresia m2 = MemLive.getInstance();
        m2 = store.createMemFactory(m2);
        MxStore tienda = new MxStore();
        m2 = MemPlatinum.getInstance();
        m2 = tienda.createMemFactory(m2);
        System.out.println(m2.getDescription());
        Membresia musical = new MusicAdapter();
        musical = new CanalesHBO(musical);
        System.out.println(musical.getDescription());

    }
}
