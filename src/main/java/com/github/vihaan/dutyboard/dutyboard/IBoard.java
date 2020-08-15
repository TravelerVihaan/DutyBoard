package com.github.vihaan.dutyboard.dutyboard;

import com.github.vihaan.dutyboard.duty.DutyType;
import com.github.vihaan.dutyboard.worker.Worker;

import java.util.Iterator;
import java.util.List;

public interface IBoard{

    Worker getActiveWorkerOnDuty();

    void setActiveWorkerOnDuty(Worker next);

    List<Worker> getAllWorkersOnBoard();

    DutyType getTypeOfDuty();

    Iterator<Worker> getWorkerIterator();

    void setWorkersIterator(Iterator<Worker> workersIterator);
}
