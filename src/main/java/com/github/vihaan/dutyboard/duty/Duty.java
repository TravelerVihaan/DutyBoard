package com.github.vihaan.dutyboard.duty;

import com.github.vihaan.dutyboard.worker.Worker;

public class Duty implements IDuty {

    private DutyType dutyType;
    private Worker activeWorkerOnDuty;

    public Duty() {
    }

    public DutyType getDutyType() {
        return dutyType;
    }

    public void setDutyType(DutyType dutyType) {
        this.dutyType = dutyType;
    }

    public Worker getActiveWorkerOnDuty() {
        return activeWorkerOnDuty;
    }

    public void setActiveWorkerOnDuty(Worker activeWorkerOnDuty) {
        this.activeWorkerOnDuty = activeWorkerOnDuty;
    }

    @Override
    public Worker getWorkerOnDuty() {
        return null;
    }

    @Override
    public String whoIsOnDutyNow() {
        return null;
    }

    @Override
    public boolean changeDuty(Worker worker, DutyType dutyType) {
        return false;
    }

    @Override
    public String toString() {
        return "Duty{" +
                "dutyType=" + dutyType +
                ", activeWorkerOnDuty=" + activeWorkerOnDuty +
                '}';
    }
}
