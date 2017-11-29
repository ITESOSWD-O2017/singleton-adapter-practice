package com.mycompany.app.netflixMemberships;

import com.mycompany.app.NetflixMembership;

public class Classic implements NetflixMembership{
    /**
     *
     * @return las peliculas disponibles.
     */
    public String getMovies() {
        return " con peliculas unicas, a 720p.";
    }

    /**
     *
     * @return los dispositovs disponibles.
     */
    public String getDevices() {
        return " disponible hasta 2 dispositivos al mismo tiempo.";
    }

    /**
     *
     * @return el precio.
     */
    public double getPrice() {
        return 99.99;

    }
}
