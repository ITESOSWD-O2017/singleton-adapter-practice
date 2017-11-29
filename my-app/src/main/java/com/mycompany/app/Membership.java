package com.mycompany.app;

public class Membership {

    private String membershipType = "m";

    private String membershipStatus = "Active";

    public String getType() {
        return this.membershipType;
    }

    public String setMembership(String type) {
        this.membershipType = type;
        return "Membresia creada";
    }

    public String activateMembership() {
        this.membershipStatus = "Active";
        return this.membershipType + " esta activa";
    }

    public String cancelMembership() {
        this.membershipStatus = "Cancel";
        return this.membershipType + " fue cancelada";
    }

    public String getStatus() {
        return this.membershipStatus;
    }


}
