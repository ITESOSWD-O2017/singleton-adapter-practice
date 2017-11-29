package com.iteso;
import com.iteso.Membership;
import com.iteso.Memberships.BronceMembership;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class bronceMembershipTest {

    Membership membership;

    @Before
    public void setUp() throws Exception {
        membership = new BronceMembership();
    }

    @Test
    public void checkMembership(){
        assertEquals("Bronce membership", membership.getProperties());
    }
}
