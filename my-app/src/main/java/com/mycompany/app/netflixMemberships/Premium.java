package com.mycompany.app.netflixMemberships;

import com.mycompany.app.NetflixMembership;

public class Premium implements NetflixMembership {
    /**
     *
     * @return las peliculas disponibles.
     */
    public String getMovies() {
        return " con Peliculas Estreno, HD, Exclusivas.";
    }

    /**
     *
     * @return los dispositovs disponibles.
     */
    public String getDevices() {
        return " disponible hasta 4 dispositivos al mismo tiempo.";
    }

    /**
     *
     * @return el precio.
     */
    public double getPrice() {
        return 140.50;

    }
}