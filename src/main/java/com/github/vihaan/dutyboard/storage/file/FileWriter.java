package com.github.vihaan.dutyboard.storage.file;

import com.github.vihaan.dutyboard.domain.worker.Worker;

import java.util.List;

public interface FileWriter {

    void writeWorkersDataToFile(List<Worker> workers);
}
