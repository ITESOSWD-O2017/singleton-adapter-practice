package com.iteso;

import com.iteso.memberships.Benefits;

/**
 * SecondMembership.
 */
public interface SecondMembership {

    /**
     * GetName.
     * @return return String
     */
    String getName();

    /**
     * GetAll.
     * @return return String
     */
    String getAll();

    /**
     *
     * @param settingBenefit benefit
     * @return a string
     */
    String pushBenefit(Benefits settingBenefit);

}
