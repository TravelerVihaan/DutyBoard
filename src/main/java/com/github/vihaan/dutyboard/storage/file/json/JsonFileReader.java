package com.github.vihaan.dutyboard.storage.file.json;

import com.github.vihaan.dutyboard.storage.file.FileReader;
import com.github.vihaan.dutyboard.worker.Worker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import java.util.Collections;
import java.util.List;

public class JsonFileReader implements FileReader {

    @Value("${dutyboard.storage.json.location}")
    private String JSON_FILE_PATH;

    @Override
    public List<Worker> loadWorkers() {
        return Collections.emptyList(); // TODO
    }

    private static final Logger logger = LoggerFactory.getLogger(JsonFileReader.class);


}
