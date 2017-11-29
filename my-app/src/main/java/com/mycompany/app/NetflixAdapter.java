package com.mycompany.app;

public class NetflixAdapter extends Membership{
    /**
     * la defincion de la interfaz.
     */
    NetflixMembership netflix;

    /**
     *
     * @param n la membresia
     */
    public NetflixAdapter(NetflixMembership n){
        netflix=n;
    }
    /**
     *
     * @return la descripción.
     */
    @Override
    public String getDescription() {
        String description;
        description = netflix.getDevices();
        description += " " + netflix.getMovies();
        return description;
    }

    /**
     *
     * @return el costo.
     */
    public double cost() {
        return netflix.getPrice();
    }
}
