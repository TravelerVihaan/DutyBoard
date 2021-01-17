package com.github.vihaan.dutyboard.storage.file.json;

import com.github.vihaan.dutyboard.domain.dutyboard.Board;
import com.github.vihaan.dutyboard.storage.file.FileReader;
import com.github.vihaan.dutyboard.domain.worker.Worker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class JsonFileReader implements FileReader {

    @Value("${dutyboard.storage.json.location}")
    private String JSON_FILE_PATH;

    @Override
    public List<Worker> readWorkersData() {
        return null;
    }

    @Override
    public List<Board> readBoardsData() {
        return null;
    }

    private static final Logger logger = LoggerFactory.getLogger(JsonFileReader.class);
}
