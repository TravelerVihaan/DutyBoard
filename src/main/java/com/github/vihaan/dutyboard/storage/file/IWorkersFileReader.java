package com.github.vihaan.dutyboard.storage.file;

import com.github.vihaan.dutyboard.worker.Worker;

import java.util.List;

public interface IWorkersFileReader {

    List<Worker> loadWorkers(String filePath);

}
