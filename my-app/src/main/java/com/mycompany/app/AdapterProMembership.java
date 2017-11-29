package com.mycompany.app;

public class AdapterProMembership implements iProMembership {

    private Membership membresia;

    public AdapterProMembership(Membership memToAdapt) {
        this.membresia =  memToAdapt;
    }

    public String addMembership() {
        return membresia.activateMembership();
    }

    public String deleteMembership() {
        return membresia.cancelMembership();
    }

    public String getName() {
        return membresia.getType();
    }
}
