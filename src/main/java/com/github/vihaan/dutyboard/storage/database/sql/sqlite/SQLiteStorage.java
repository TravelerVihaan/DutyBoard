package com.github.vihaan.dutyboard.storage.database.sql.sqlite;

import com.github.vihaan.dutyboard.storage.database.sql.SQLStorage;
import com.github.vihaan.dutyboard.worker.Worker;

import java.util.Collection;

public class SQLiteStorage extends SQLStorage{
    @Override
    public Worker getWorkerByNameOrSurname(String name) {
        return null;
    }

    @Override
    public Collection<Worker> getAllWorkers() {
        return null;
    }
}

