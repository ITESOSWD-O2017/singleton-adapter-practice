package com.iteso.singleton.Memberships;

import com.iteso.singleton.Membership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SilverTest {
    Membership membership;
    @Before
    public void setUp() throws Exception {
        membership = Silver.getInstance();
    }

    @Test
    public void getInstance() throws Exception {
        assertNotEquals(membership,null);
    }

    @Test
    public void getMembershipType() throws Exception {
        assertEquals("Silver Membership",membership.getMembershipType());
    }

    @Test
    public void activateMembersip() throws Exception {
        assertEquals("The Silver Membership has been activated",membership.activateMembership());
    }

    @Test
    public void getMembershipStatus() throws Exception {
        membership.cancelMembership();
        assertEquals("Cancelled",membership.getMembershipStatus());
    }

}