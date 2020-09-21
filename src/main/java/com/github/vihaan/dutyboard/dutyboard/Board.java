package com.github.vihaan.dutyboard.dutyboard;

import com.github.vihaan.dutyboard.duty.DutyType;
import com.github.vihaan.dutyboard.worker.Worker;
import com.github.vihaan.dutyboard.worker.absence.Presence;

import java.util.Collection;
import java.util.Iterator;

public interface Board {

    Worker getCurrentWorker();

    void changeDuty();

    DutyType getTypeOfDuty();

    boolean isNextWorkerPresent(Worker worker);

    Collection<Worker> getAllWorkersOnBoard();
}
