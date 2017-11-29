package com.Singleton.Memberships.Benefits;
import com.Singleton.Memberships.BenefitsMembership;
import com.Singleton.Membership;

/**
 * Clas Instructor.
 */
public class PersonalInstructor extends BenefitsMembership {
    /**
     * instructor.
     */
    private Membership instructor;

    /**
     * default constructor.
     * @param instructors a.
     */
    public PersonalInstructor(final Membership instructors) {
        this.instructor = instructors;
    }

    /**
     * a.
     * @return membershp.
     */
    public final String getMembership() {
        if (this.instructor != null) {
            return this.instructor.getMembership() + ", personal instructor.";
        } else {
            return "Add your membership type";
        }
    }
    /**
     * a.
     * @return client.
     */
    public final String getClient() {
        return instructor.getMembership() + " instructor";
    }
}
