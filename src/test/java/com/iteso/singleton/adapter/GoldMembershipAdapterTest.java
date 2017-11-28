package com.iteso.singleton.adapter;

import com.iteso.singleton.adapter.memberships.Gold;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoldMembershipAdapterTest {
    Membership goldMembership = Gold.getUniqueInstance();
    CoolMembership coolMembershipAdapted = new CoolMembershipAdapter(goldMembership);

    @Test
    public void getSubscriber() {
        assertEquals("Gold subscriber", coolMembershipAdapted.getSubscriber());
    }

    @Test
    public void printCredential() {
        assertEquals("New member credential", coolMembershipAdapted.printCredential());
    }

    @Test
    public void addBenefits() {
        assertEquals("Gold membership", coolMembershipAdapted.addBenefits());
    }
}
