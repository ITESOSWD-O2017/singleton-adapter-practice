package com.iteso.singleton;

import com.iteso.singleton.Memberships.Gold;
import org.junit.Test;

import static org.junit.Assert.*;

public class NeoMembershipAdapterTest {
    Membership membership = Gold.getInstance();
    NeoMembership converted = new NeoMembershipAdapter(membership);

    @Test
    public void hireMembership() throws Exception {
        assertEquals("The Gold Membership has been activated",converted.hireMembership());
    }

    @Test
    public void freezeMembership() throws Exception {
        assertEquals("The Gold Membership has been cancelled", converted.freezeMembership());

    }

    @Test
    public void getMembershipName() throws Exception {
        assertEquals("Gold Membership", converted.getMembershipName());
    }

}