package com.github.vihaan.dutyboard.dutyboard;

import com.github.vihaan.dutyboard.duty.DutyType;
import com.github.vihaan.dutyboard.worker.Worker;
import com.github.vihaan.dutyboard.worker.absence.Presence;

import java.util.Collection;
import java.util.Iterator;

public interface IBoard{

    Worker getActiveWorkerOnDuty();

    void changeDuty();

    Collection<Worker> getAllWorkersOnBoard();

    DutyType getTypeOfDuty();

    Presence isNextWorkerPresent();
}
