package com.iteso.singleton.adapter;

import com.iteso.singleton.adapter.memberships.Platinum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlatinumMembershipAdapterTest {
    Membership platinumMembership = Platinum.getUniqueInstance();
    CoolMembership coolMembershipAdapted = new CoolMembershipAdapter(platinumMembership);

    @Test
    public void getSubscriber() {
        assertEquals("Platinum subscriber", coolMembershipAdapted.getSubscriber());
    }

    @Test
    public void printCredential() {
        assertEquals("New member credential", coolMembershipAdapted.printCredential());
    }

    @Test
    public void addBenefits() {
        assertEquals("Platinum membership", coolMembershipAdapted.addBenefits());
    }
}
