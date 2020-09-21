package com.github.vihaan.dutyboard.dutyboard;

import com.github.vihaan.dutyboard.duty.DutyType;
import com.github.vihaan.dutyboard.worker.Worker;
import com.github.vihaan.dutyboard.worker.presence.Presence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

public class ListBoard implements Board {

    private LinkedList<Worker> workersOnBoard;
    private final DutyType typeOfDuty;

    public ListBoard(List<Worker> workersOnBoard, DutyType typeOfDuty) {
        this.workersOnBoard = new LinkedList<>(workersOnBoard);
        this.typeOfDuty = typeOfDuty;
    }

    @Override
    public Worker getCurrentWorker() {
        Worker currentWorker = workersOnBoard.getLast();
        LOGGER.debug("Active worker on board: " + getTypeOfDuty().getDutyType() + " is " + currentWorker.getFullName() + ".");
        return currentWorker;
    }

    @Override
    public void changeDuty() {
        do{
            workersOnBoard.addFirst(getCurrentWorker());
        } while(isNextWorkerPresent(getCurrentWorker()));
        LOGGER.info(getCurrentWorker().getFullName() + " is on duty now.");
    }

    @Override
    public DutyType getTypeOfDuty() {
        return typeOfDuty;
    }

    @Override
    public boolean isNextWorkerPresent(Worker worker) {
        boolean isPresent = worker.getPresence() == Presence.PRESENT;
        if (!isPresent) {
            LOGGER.warn(worker.getFullName() + "absent. Duty check skips to the next employee.");
        }
        return isPresent;
    }

    @Override
    public List<Worker> getAllWorkersOnBoard() {
        return workersOnBoard;
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(ListBoard.class);
}
