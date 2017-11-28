package com.iteso.singleton.adapter;

/**
 * Created by AlejandraSahagun on 27/11/17.
 */
public interface CoolMembership {

    /**
     * get name of the subscriber.
     * @return subscriber.
     */
    String getSubscriber();

    /** print credential.
     * @return stringCredential */
    String printCredential();

    /** add aditional benefits.
     * @return stringBenefits */
    String addBenefits();

}
