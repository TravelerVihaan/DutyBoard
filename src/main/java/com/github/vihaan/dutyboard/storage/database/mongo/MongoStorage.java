package com.github.vihaan.dutyboard.storage.database.mongo;

import com.github.vihaan.dutyboard.storage.Storage;
import com.github.vihaan.dutyboard.worker.Worker;

import java.util.Collection;

public class MongoStorage implements Storage {
    @Override
    public Worker getWorkerByNameOrSurname(String name) {
        return null;
    }

    @Override
    public Collection<Worker> getAllWorkers() {
        return null;
    }
}
