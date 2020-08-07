package com.github.vihaan.dutyboard.storage.file;

import com.github.vihaan.dutyboard.worker.Worker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class WorkersJsonFileReader implements IWorkersFileReader {
    @Override
    public List<Worker> loadWorkers(String filePath) {
        List<Worker> workersList = null;
        try(Reader reader = new FileReader(JSON_FILE_PATH)){
            workersList = new Gson().fromJson(reader, new TypeToken<List<Worker>>() {}.getType());
        } catch (FileNotFoundException e){
            logger.warn(FileMessages.FILE_NOT_FOUND);
        } catch (IOException e) {
            logger.warn(FileMessages.IO_READ_PROBLEM);
        }
        return workersList;
    }

    private static final String JSON_FILE_PATH = "";
    private static final Logger logger = LoggerFactory.getLogger(WorkersJsonFileReader.class);
}
