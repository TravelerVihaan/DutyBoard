package com.github.vihaan.dutyboard.storage.file.json;

import com.github.vihaan.dutyboard.storage.file.FileDataTransformer;
import com.github.vihaan.dutyboard.domain.worker.Worker;

import java.util.List;

public class JsonFileDataTransformer implements FileDataTransformer {
    @Override
    public List<Worker> transformRawDataToWorkerObjects(List<String> rawDataList) {
        return null;
    }
}
