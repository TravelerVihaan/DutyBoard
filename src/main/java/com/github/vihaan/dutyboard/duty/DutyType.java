package com.github.vihaan.dutyboard.duty;

public enum DutyType {

    PRESENTATION(DutyConstants.PRESENTATION_DESCRIPTION),
    TESTS(DutyConstants.TESTS_DESCRIPTION);

    DutyType(String dutyType){
        this.dutyType = dutyType;
    }

    String getDutyType(){return dutyType;}

    private String dutyType;

}
