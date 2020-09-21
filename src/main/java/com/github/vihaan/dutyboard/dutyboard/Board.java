package com.github.vihaan.dutyboard.dutyboard;

import com.github.vihaan.dutyboard.duty.DutyType;
import com.github.vihaan.dutyboard.worker.Worker;

import java.util.Collection;

public interface Board {

    Worker getCurrentWorker();

    void changeDuty();

    DutyType getTypeOfDuty();

    boolean isNextWorkerPresent(Worker worker);

    Collection<Worker> getAllWorkersOnBoard();
}
