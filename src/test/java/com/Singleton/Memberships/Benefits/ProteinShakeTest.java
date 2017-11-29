package com.Singleton.Memberships.Benefits;
import org.junit.Before;
import org.junit.Test;
import com.Singleton.Membership;
import com.Singleton.Memberships.Platinum;
import static org.junit.Assert.assertEquals;

public class ProteinShakeTest {
    Membership membership;

    @Before
    public void setUp() throws Exception {
        membership = new Platinum();
    }

    @Test
    public void testGetMembership() throws Exception {
        assertEquals("Platinum membership", membership.getMembership());
    }

    @Test
    public void proteinShake(){
        membership = new ProteinShake(membership);
        assertEquals("Platinum membership, free monthly protein shake.", membership.getMembership());
    }
}