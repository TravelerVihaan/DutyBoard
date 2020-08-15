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

    public Board(List<Worker> workersOnBoard, DutyType typeOfDuty) {
        this.workersOnBoard = workersOnBoard;
        this.typeOfDuty = typeOfDuty;
        workersIterator = this.workersOnBoard.iterator();
    }

    @Override
    public Worker getActiveWorkerOnDuty() {
        return workerOnDuty;
    }

    @Override
    public void setActiveWorkerOnDuty(Worker worker) {
        workerOnDuty = worker;
    }

    @Override
    public DutyType getTypeOfDuty() {
        return typeOfDuty;
    }

    @Override
    public Iterator<Worker> getWorkerIterator() {
        return workersIterator;
    }

    public void setWorkersIterator(Iterator<Worker> workersIterator) {
        this.workersIterator = workersIterator;
    }

    @Override
    public List<Worker> getAllWorkersOnBoard() {
        return workersOnBoard;
    }
}
