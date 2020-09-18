package com.github.vihaan.dutyboard.storage;

import com.github.vihaan.dutyboard.worker.Worker;

import java.util.Collection;

public interface Storage {

    Worker getWorkerByNameOrSurname(String name);

    Collection<Worker> getAllWorkers();
}
