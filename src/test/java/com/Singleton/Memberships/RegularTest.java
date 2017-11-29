package com.Singleton.Memberships;
import com.Singleton.Membership;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RegularTest {
    Membership membership;

    @Before
    public void setUp() throws Exception {
        membership = new Regular();
    }

    @Test
    public void checkMembership(){
        assertEquals("Regular membership", membership.getMembership());
    }

}