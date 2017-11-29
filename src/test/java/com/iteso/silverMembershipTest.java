package com.iteso;
import com.iteso.Membership;
import com.iteso.Memberships.SilverMembership;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class silverMembershipTest {

    Membership membership;

    @Before
    public void setUp() throws Exception {
        membership = new SilverMembership();
    }

    @Test
    public void checkMembership(){
        assertEquals("Silver membership", membership.getProperties());
    }
}
