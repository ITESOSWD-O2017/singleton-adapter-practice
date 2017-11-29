package com.Singleton.Memberships.Benefits;
import org.junit.Before;
import org.junit.Test;
import com.Singleton.Membership;
import com.Singleton.Memberships.Gold;
import static org.junit.Assert.assertEquals;

public class AccessToShowersTest {
    Membership membership;

    @Before
    public void setUp() throws Exception {
        membership = new Gold();
        membership = new AccessToShowers(membership);
    }

    @Test
    public void testGetMembership() throws Exception {
        assertEquals("Gold membership", membership.getMembership());
    }

}