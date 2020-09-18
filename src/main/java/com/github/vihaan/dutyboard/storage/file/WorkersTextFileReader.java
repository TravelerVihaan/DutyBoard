package com.github.vihaan.dutyboard.storage.file;

import com.github.vihaan.dutyboard.storage.file.FileMessages;
import com.github.vihaan.dutyboard.worker.Worker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class WorkersTextFileReader implements IWorkersFileReader {

    public List<Worker> loadWorkers(String filePath){
        List<String> parsedWorkers = readWorkersFromFile(filePath);
        //parsedWorkers.stream().map();
        return null;
    }

    private List<String> readWorkersFromFile(String filePath){
        List<String> parsedWorkers = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            stream.forEach(parsedWorkers::add);
        }catch (FileNotFoundException e){
            logger.warn(FileMessages.FILE_NOT_FOUND);
        }catch (IOException e){
            logger.warn(FileMessages.IO_READ_PROBLEM);
        }

        return parsedWorkers;
    }

    private static final String TXT_FILE_PATH = "";
    private static final Logger logger = LoggerFactory.getLogger(WorkersTextFileReader.class);
}
