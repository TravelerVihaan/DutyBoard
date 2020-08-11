package com.github.vihaan.dutyboard.dutyboard;

import com.github.vihaan.dutyboard.duty.DutyType;
import com.github.vihaan.dutyboard.worker.Worker;

import java.util.Iterator;
import java.util.List;

public class Board implements IBoard {

    private List<Worker> workersOnBoard;
    private Iterator<Worker> workersIterator;
    private Worker workerOnDuty;
    private final DutyType typeOfDuty;

    public Board(DutyType typeOfDuty) {
        this.typeOfDuty = typeOfDuty;
        workersIterator = workersOnBoard.iterator();
    }

    @Override
    public Worker getActiveWorkerOnDuty() {
        return workerOnDuty;
    }

    public DutyType getTypeOfDuty() {
        return typeOfDuty;
    }

    @Override
    public List<Worker> getAllWorkersOnBoard() {
        return null;
    }
}
