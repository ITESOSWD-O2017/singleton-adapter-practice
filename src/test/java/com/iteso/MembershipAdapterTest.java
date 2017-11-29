package com.iteso;

import com.iteso.benefits.HD;
import com.iteso.benefits.Pantalla1;
import com.iteso.memberships.PantallaHD1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MembershipAdapterTest {

    Membership membership = new Pantalla1();

    MembershipAdapter adapterMembership;

    @Before
    public void setUp() throws Exception {
        membership = new PantallaHD1();
        adapterMembership = new MembershipAdapter(membership);
    }

    @Test
    public void checkName() {
        Assert.assertEquals("HD1", adapterMembership.getName());
    }

    @Test
    public void checkPushBenefit() {
        Assert.assertEquals("Benefits: Pantallas Calidad HD", adapterMembership.pushBenefit(new HD()));

    }

    @Test
    public void checkAll() {
        Assert.assertEquals("Todas las características Tipo de usuario: HD1", adapterMembership.getAll());
    }

}
