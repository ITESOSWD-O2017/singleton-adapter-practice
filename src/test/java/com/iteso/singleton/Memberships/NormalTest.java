package com.iteso.singleton.Memberships;

import com.iteso.singleton.Membership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NormalTest {

    Membership membership;
    @Before
    public void setUp() throws Exception {
       membership = Normal.getInstance();
    }

    @Test
    public void getInstance() throws Exception {
        assertNotEquals(null,membership);
    }

    @Test
    public void getMembershipType() throws Exception {
        assertEquals("Normal Membership",membership.getMembershipType());
    }

    @Test
    public void getMembershipStatus() throws Exception {
        membership.activateMembership();
        assertEquals("Active",membership.getMembershipStatus());
    }

    @Test
    public void cancelMembership() throws Exception {
        assertEquals("The Normal Membership has been cancelled", membership.cancelMembership());
    }



}