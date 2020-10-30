package com.github.vihaan.dutyboard.storage.database.sql.mysql;

import com.github.vihaan.dutyboard.duty.DutyType;
import com.github.vihaan.dutyboard.dutyboard.Board;
import com.github.vihaan.dutyboard.storage.database.sql.SQLStorage;
import com.github.vihaan.dutyboard.storage.database.sql.repositories.BoardJpaRepository;
import com.github.vihaan.dutyboard.storage.database.sql.repositories.DutyTypeJpaRepository;
import com.github.vihaan.dutyboard.storage.database.sql.repositories.PresenceJpaRepository;
import com.github.vihaan.dutyboard.storage.database.sql.repositories.WorkerJpaRepository;
import com.github.vihaan.dutyboard.worker.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

@Service
public class MySqlStorage extends SQLStorage {

    private WorkerJpaRepository workerJpaRepository;
    private DutyTypeJpaRepository dutyTypeJpaRepository;
    private PresenceJpaRepository presenceJpaRepository;
    private BoardJpaRepository boardJpaRepository;

    @Autowired
    public MySqlStorage(WorkerJpaRepository workerJpaRepository,
                        DutyTypeJpaRepository dutyTypeJpaRepository,
                        PresenceJpaRepository presenceJpaRepository,
                        BoardJpaRepository boardJpaRepository) {
        this.workerJpaRepository = workerJpaRepository;
        this.dutyTypeJpaRepository = dutyTypeJpaRepository;
        this.presenceJpaRepository = presenceJpaRepository;
        this.boardJpaRepository = boardJpaRepository;
    }

    @Override
    public Worker getWorkerByNameOrSurname(String name) {
        return null;
    }

    @Override
    public Collection<Worker> getAllWorkers() {
        return null;
    }

    @Override
    public Set<Board> getBoards() {
        return null;
    }

    @Override
    public Optional<Board> getBoard(DutyType dutyType) {
        return Optional.empty();
    }

    @Override
    public boolean saveBoard(Board board) {
        return false;
    }

    @Override
    public boolean deleteBoard(Board board) {
        return false;
    }

    @Override
    public boolean saveWorker(Worker worker) {
        return false;
    }

    @Override
    public boolean deleteWorker(Worker worker) {
        return false;
    }
}
