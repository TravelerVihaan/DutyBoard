package com.github.vihaan.dutyboard.storage.database.mongo;

import com.github.vihaan.dutyboard.domain.duty.DutyType;
import com.github.vihaan.dutyboard.domain.dutyboard.Board;
import com.github.vihaan.dutyboard.storage.Storage;
import com.github.vihaan.dutyboard.storage.database.mongo.repositories.BoardMongoRepository;
import com.github.vihaan.dutyboard.storage.database.mongo.repositories.WorkerMongoRepository;
import com.github.vihaan.dutyboard.domain.worker.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

@Service
@Qualifier("mongo-storage")
public class MongoStorage implements Storage {

    private WorkerMongoRepository workerMongoRepository;
    private BoardMongoRepository boardMongoRepository;

    @Autowired
    public MongoStorage(WorkerMongoRepository workerMongoRepository,
                        BoardMongoRepository boardMongoRepository) {
        this.workerMongoRepository = workerMongoRepository;
        this.boardMongoRepository = boardMongoRepository;
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
    public Worker getWorkerByName(String name) {
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
