package com.github.vihaan.dutyboard.storage.file.text;

import com.github.vihaan.dutyboard.storage.file.FileReader;
import com.github.vihaan.dutyboard.storage.properties.StorageProperties;
import com.github.vihaan.dutyboard.worker.Worker;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class TextFileReader implements FileReader {

    private final StorageProperties storageProperties;

    @Autowired
    public TextFileReader(StorageProperties storageProperties) {
        this.storageProperties = storageProperties;
    }

    public List<Worker> loadWorkers(){
        Optional<List<String>> workersData = Optional.ofNullable(readDataFromFile(this.storageProperties.getText()));
        return Collections.emptyList(); // TODO
    }

    private List<String> readDataFromFile(String filePath){
        List<String> dataFromFile = null;
        File file = new File(filePath);
        if(!file.exists()){
            LOGGER.error(FILE_NOT_FOUND);
            return dataFromFile;
        }
        try {
            dataFromFile = FileUtils.readLines(file, CHARSET_UTF8);
        } catch (IOException e) {
            LOGGER.error(IO_READ_PROBLEM);
        }
        return dataFromFile;
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(TextFileReader.class);
}
