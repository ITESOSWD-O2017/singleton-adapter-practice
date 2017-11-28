package com.iteso.singleton.adapter;

import com.iteso.singleton.adapter.memberships.Bronze;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BronzeMembershipAdapterTest {
    Membership bronzeMembership = Bronze.getUniqueInstance();
    CoolMembership coolMembershipAdapted = new CoolMembershipAdapter(bronzeMembership);

    @Test
    public void getSubscriber() {
        assertEquals("Bronze subscriber", coolMembershipAdapted.getSubscriber());
    }

    @Test
    public void printCredential() {
        assertEquals("New member credential", coolMembershipAdapted.printCredential());
    }

    @Test
    public void addBenefits() {
        assertEquals("Bronze membership", coolMembershipAdapted.addBenefits());
    }
}
