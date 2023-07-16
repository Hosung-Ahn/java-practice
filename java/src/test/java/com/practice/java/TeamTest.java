package com.practice.java;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class TeamTest {
    @Test
    public void EnrollmentTest() {
        Team team = new Team();

        team.maxNumberOfApplicant = 100;
        team.numberOfEnrollment = 99;

        assertThat(team.isEnrollmentFull()).isFalse();
    }
}