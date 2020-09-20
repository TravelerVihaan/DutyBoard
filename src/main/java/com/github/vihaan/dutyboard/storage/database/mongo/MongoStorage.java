package com.github.vihaan.dutyboard.storage.database.mongo;

import com.github.vihaan.dutyboard.storage.Storage;
import com.github.vihaan.dutyboard.storage.database.mongo.repositories.WorkerMongoRepository;
import com.github.vihaan.dutyboard.worker.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Qualifier("mongo-storage")
public class MongoStorage implements Storage {

    private WorkerMongoRepository workerMongoRepository;
    @Autowired
    public MongoStorage(WorkerMongoRepository workerMongoRepository) {
        this.workerMongoRepository = workerMongoRepository;
    }

    @Override
    public Worker getWorkerByNameOrSurname(String name) {
        return null;
    }

    @Override
    public Collection<Worker> getAllWorkers() {
        return null;
    }
}
