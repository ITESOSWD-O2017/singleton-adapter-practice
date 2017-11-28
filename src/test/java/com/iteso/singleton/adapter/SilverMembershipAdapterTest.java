package com.iteso.singleton.adapter;

import com.iteso.singleton.adapter.CoolMembershipAdapter;
import com.iteso.singleton.adapter.CoolMembership;
import com.iteso.singleton.adapter.memberships.Silver;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SilverMembershipAdapterTest {
    Membership silverMembership = Silver.getUniqueInstance();
    CoolMembership coolMembershipAdapted = new CoolMembershipAdapter(silverMembership);

    @Test
    public void getSubscriber() {
        assertEquals("Silver subscriber", coolMembershipAdapted.getSubscriber());
    }

    @Test
    public void printCredential() {
        assertEquals("New member credential", coolMembershipAdapted.printCredential());
    }

    @Test
    public void addBenefits() {
        assertEquals("Silver membership", coolMembershipAdapted.addBenefits());
    }
}
