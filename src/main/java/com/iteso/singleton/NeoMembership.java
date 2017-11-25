package com.iteso.singleton;

/**
 * Neo Membership abstract class.
 */
public interface NeoMembership {
    /**
     *Cancelling membership.
     *@return status.
     */
    String hireMembership();

    /**
     *Freezing membership.
     * @return status.
     */
    String freezeMembership();

    /**
     **Getting membership name.
     * @return status.
     */
    String getMembershipName();

}
