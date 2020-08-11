package com.github.vihaan.dutyboard.dutyboard;

import com.github.vihaan.dutyboard.duty.DutyType;
import com.github.vihaan.dutyboard.worker.Worker;

import java.util.List;

public class Board implements IBoard {

    private List<Worker> workersOnBoard;
    private Worker workerOnDuty;
    private final DutyType typeOfDuty;

    public Board(DutyType typeOfDuty) {
        this.typeOfDuty = typeOfDuty;
    }

    @Override
    public Worker getActiveWorkerOnDuty() {
        return null;
    }

    public DutyType getTypeOfDuty() {
        return typeOfDuty;
    }

    @Override
    public List<Worker> getAllWorkersOnBoard() {
        return null;
    }
}
