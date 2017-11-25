package com.iteso.singleton.Memberships;

import com.iteso.singleton.Membership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlatinumTest {
    Membership membership;

    @Before
    public void setUp() throws Exception {
        membership = Platinum.getInstance();
    }
    @Test
    public void getMembershipType() throws Exception {
        assertEquals("Platinum Membership", membership.getMembershipType());
    }

    @Test
    public void setMembership() throws Exception {
        assertEquals("Membership has been created", membership.setMembership("Hello"));
    }

    @Test
    public void activateMembersip() throws Exception {
        assertEquals("The Platinum Membership has been activated",membership.activateMembership());
    }

    @Test
    public void cancelMembership() throws Exception {
        assertEquals("The Platinum Membership has been cancelled", membership.cancelMembership());
    }

}