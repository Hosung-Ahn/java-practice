package com.practice.java;

public class Team {
    int maxNumberOfApplicant;
    int numberOfEnrollment;

    public boolean isEnrollmentFull() {
        if (maxNumberOfApplicant == 0) {
            return false;
        }

        if (numberOfEnrollment < maxNumberOfApplicant) {
            return false;
        }
        return true;
    }
}
