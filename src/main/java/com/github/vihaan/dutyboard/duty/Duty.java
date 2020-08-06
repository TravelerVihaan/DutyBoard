package com.github.vihaan.dutyboard.duty;

import com.github.vihaan.dutyboard.worker.Worker;

public interface Duty {

    Worker getWorkerOnDuty();

    String whoIsOnDutyNow();

    boolean changeDuty(Worker worker, DutyType dutyType);
}
