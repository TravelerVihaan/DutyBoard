package com.github.vihaan.dutyboard.duty;

public enum DutyType {

    PRESENTATION(DutyConstants.PRESENTATION_DESCRIPTION),
    TESTS(DutyConstants.TESTS_DESCRIPTION);

    String dutyType;

    DutyType(String dutyType) {
        this.dutyType = dutyType;
    }

    public String getDutyType() {
        return dutyType;
    }
}
