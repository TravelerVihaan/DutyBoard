package com.github.vihaan.dutyboard.elements.dutyboard;

import com.github.vihaan.dutyboard.elements.duty.DutyType;
import com.github.vihaan.dutyboard.elements.worker.Worker;

import java.util.Collection;

public interface Board {

    Worker getCurrentWorker();

    void changeDuty();

    DutyType getTypeOfDuty();

    boolean isNextWorkerPresent(Worker worker);

    Collection<Worker> getAllWorkersOnBoard();
}
