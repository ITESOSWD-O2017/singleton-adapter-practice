package com.Singleton.Memberships;
import com.Singleton.JackedMembership;
import com.Singleton.JackedMembershipAdapter;
import com.Singleton.Membership;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SilverTest {
    Membership membership;

    @Before
    public void setUp() throws Exception {
        membership = new Silver();
    }

    @Test
    public void checkMembership(){
        assertEquals("Silver membership", membership.getMembership());
    }
}