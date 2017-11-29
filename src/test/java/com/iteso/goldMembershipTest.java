package com.iteso;
import com.iteso.Membership;
import com.iteso.Memberships.GoldMembership;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class goldMembershipTest {

    Membership membership;

    @Before
    public void setUp() throws Exception {
        membership = new GoldMembership();
    }

    @Test
    public void checkMembership(){
        assertEquals("Gold membership", membership.getProperties());
    }
}
