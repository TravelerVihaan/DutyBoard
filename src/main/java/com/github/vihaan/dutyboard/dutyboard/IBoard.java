package com.github.vihaan.dutyboard.dutyboard;

import com.github.vihaan.dutyboard.worker.Worker;

import java.util.List;

public interface IBoard{

    Worker getActiveWorkerOnDuty();

    List<Worker> getAllWorkersOnBoard();
}
