package com.iteso;
import com.iteso.Membership;
import com.iteso.Memberships.DiamondMembership;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class diamondMembershipTest {

    Membership membership;

    @Before
    public void setUp() throws Exception {
        membership = new DiamondMembership();
    }

    @Test
    public void checkMembership(){
        assertEquals("Diamond membership", membership.getProperties());
    }
}
