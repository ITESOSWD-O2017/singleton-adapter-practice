package com.iteso.singleton.adapter;

/**
 * Created by AlejandraSahagun on 19/11/17.
 */
public abstract class Membership {

    /** subscriber. */
    private String subscriber = "New member";

    /** constructor. */
    public Membership() {
        super();
    }

    /** @return String */
    public abstract String getSubscriber();

    /** @return String */
    private String description = "";

    /** @return String */
    public abstract String getDescription();

    /** @param d */
    public Membership(final String d) {
        this.description = d;
    }

    /** @return double */
    public abstract double cost();

    /** void printCredential.
     * @return string. */
    public final String printCredential() {
        System.out.println("Typing " + subscriber);
        System.out.println("Adding photo...");
        System.out.println("Adding number of subscriber...");
        System.out.println("Printing...");
        return "New member credential";
    }

}
