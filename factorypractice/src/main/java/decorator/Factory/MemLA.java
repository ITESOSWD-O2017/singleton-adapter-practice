package decorator.Factory;


import decorator.Beneficios.Exclusivo;
import decorator.Beneficios.Personalizacion;
import decorator.Beneficios.VariosDispositivos;
import decorator.Beneficios.Video4K;
import decorator.Beneficios.Streaming;
import decorator.Beneficios.SinAnuncios;
import decorator.Beneficios.SubirVideos;
import decorator.Membresia;
import decorator.Membresias.Bronce;
import decorator.Membresias.Oro;
import decorator.Membresias.Plata;
import decorator.Membresias.Platinum;
import decorator.Membresias.Cobre;

/**
 *
 */
public class MemLA extends MemFact {
    /**
     *
     * @param membresia cc
     * @return cc
     */
    public final Membresia createmembership(final Membresia membresia) {
        if (membresia.getClass() == Platinum.class) {
            Membresia temp = Platinum.getUniqueInstance();
            temp = new Exclusivo(membresia);
            temp = new Video4K(membresia);
            temp = new VariosDispositivos(membresia);
            temp = new Personalizacion(membresia);
            temp = new SinAnuncios(membresia);
            temp = new Streaming(membresia);
            temp = new SubirVideos(membresia);
            return temp;
        } else if (membresia.getClass() == Oro.class) {
            Membresia temp = Oro.getUniqueInstance();
            temp = new Exclusivo(membresia);
            temp = new VariosDispositivos(membresia);
            temp = new Personalizacion(membresia);
            temp = new SinAnuncios(membresia);
            temp = new Streaming(membresia);
            temp = new SubirVideos(membresia);
            return temp;
        } else if (membresia.getClass() == Plata.class) {
            Membresia temp =  Plata.getUniqueInstance();
            temp = new VariosDispositivos(membresia);
            temp = new SinAnuncios(membresia);
            temp = new Streaming(membresia);
            temp = new SubirVideos(membresia);
            return temp;
        } else if (membresia.getClass() == Bronce.class) {
            Membresia temp =  Bronce.getUniqueInstance();
            temp = new SinAnuncios(membresia);
            temp = new Streaming(membresia);
            temp = new SubirVideos(membresia);
            return temp;
        }  else if (membresia.getClass() == Cobre.class) {
            Membresia temp =  Cobre.getUniqueInstance();
            temp = new Streaming(membresia);
            temp = new SubirVideos(membresia);
           return temp;
        }
    return membresia;
    }
}
