package com.github.vihaan.dutyboard.dutyboard;

import com.github.vihaan.dutyboard.duty.DutyType;
import com.github.vihaan.dutyboard.worker.Worker;
import com.github.vihaan.dutyboard.worker.absence.Presence;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListBoard implements IBoard {

    private LinkedList<Worker> workersOnBoard;
    private final DutyType typeOfDuty;

    public ListBoard(List<Worker> workersOnBoard, DutyType typeOfDuty) {
        this.workersOnBoard = new LinkedList<>(workersOnBoard);
        this.typeOfDuty = typeOfDuty;
    }

    @Override
    public Worker getActiveWorkerOnDuty() {
        return workersOnBoard.getLast();
    }

    @Override
    public void changeDuty() {
        do{
            workersOnBoard.addFirst(workersOnBoard.getLast());
        } while(workersOnBoard.getLast().getPresence() == Presence.ABSENT);
    }

    @Override
    public DutyType getTypeOfDuty() {
        return typeOfDuty;
    }

    @Override
    public Presence isNextWorkerPresent() {
        return null;
    }

    public Presence isNextWorkerPresent(Worker worker) {
        return worker.getPresence();
    }

    @Override
    public List<Worker> getAllWorkersOnBoard() {
        return workersOnBoard;
    }
}
