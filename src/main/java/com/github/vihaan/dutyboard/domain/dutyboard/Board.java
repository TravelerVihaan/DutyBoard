package com.github.vihaan.dutyboard.domain.dutyboard;

import com.github.vihaan.dutyboard.domain.duty.DutyType;
import com.github.vihaan.dutyboard.domain.worker.Worker;

import java.util.Collection;

public interface Board {

    Worker getCurrentWorker();

    void changeDuty();

    DutyType getTypeOfDuty();

    boolean isNextWorkerPresent(Worker worker);

    Collection<Worker> getAllWorkersOnBoard();
}
