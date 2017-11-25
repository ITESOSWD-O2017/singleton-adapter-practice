package com.iteso.singleton.Memberships;

import com.iteso.singleton.Membership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GoldTest {
    Membership membership;
    @Before
    public void setUp() throws Exception {
        membership = Gold.getInstance();
    }

    @Test
    public void getMembershipType() throws Exception {
        assertEquals("Gold Membership",membership.getMembershipType());
    }

    @Test
    public void setMembership() throws Exception {
        assertEquals("Membership has been created",membership.setMembership(""));
    }

    @Test
    public void cancelMembership() throws Exception {
        assertEquals("The Gold Membership has been cancelled",membership.cancelMembership());
    }

    @Test
    public void getMembershipStatus() throws Exception {
        assertEquals("Cancelled", membership.getMembershipStatus());
    }

}