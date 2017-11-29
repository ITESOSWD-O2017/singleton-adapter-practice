package com.iteso;

/**.
 * Class membership
 */
public abstract class Membership {

    /**.
     * Var
     */
    private String propertyUser = "The user";

    /**.
     * Vari
     */
    private String mem = "Membresia";
    /**
     *
     * @return obtener prop
     */
    public abstract String getProperties();

    /**
     *
     * @param property propert
     */
    public final void setProperty(final String property) {
        this.propertyUser = property;
    }

    /**
     *
     * @return propiedad
     */
    public final String sendProperty() {
        return this.propertyUser;
    }

    /**
     *
     * @return mem
     */
    final String revenueMembership() {
        System.out.println("Revenuing the users membership...");
        return mem;
    }

    /**
     *
     * @return can
     */
    final String cancelMembership() {
        System.out.println("Canceling users membership...");
        return mem;
    }

    /**
     *
     * @return chan
     */
    public final String changeMembershipOwner() {
        System.out.println("Changing the users membership to another owner...");
        return mem;
    }

}
