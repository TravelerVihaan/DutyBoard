package com.github.vihaan.dutyboard.storage.file.json;

import com.github.vihaan.dutyboard.storage.file.FileStorage;
import com.github.vihaan.dutyboard.worker.Worker;

import java.util.Collection;

public class JsonFileStorage implements FileStorage {
    @Override
    public Worker getWorkerByNameOrSurname(String name) {
        return null;
    }

    @Override
    public Collection<Worker> getAllWorkers() {
        return null;
    }
}
