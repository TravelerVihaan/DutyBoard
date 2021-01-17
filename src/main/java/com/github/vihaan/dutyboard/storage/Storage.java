package com.github.vihaan.dutyboard.storage;

import com.github.vihaan.dutyboard.elements.duty.DutyType;
import com.github.vihaan.dutyboard.elements.dutyboard.Board;
import com.github.vihaan.dutyboard.elements.worker.Worker;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

public interface Storage {

    Worker getWorkerByNameOrSurname(String name);

    Collection<Worker> getAllWorkers();

    Set<Board> getBoards();

    Optional<Board> getBoard(DutyType dutyType);

    boolean saveBoard(Board board);

    boolean deleteBoard(Board board);

    boolean saveWorker(Worker worker);

    boolean deleteWorker(Worker worker);


}
