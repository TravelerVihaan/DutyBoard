package com.github.vihaan.dutyboard.storage.file.text;

import com.github.vihaan.dutyboard.elements.worker.Worker;
import com.github.vihaan.dutyboard.storage.file.FileDataTransformer;
import com.github.vihaan.dutyboard.storage.file.text.mapper.TextToObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TextFileDataTransformer implements FileDataTransformer {

    private final TextToObjectMapper<Worker> textToObjectMapper;

    @Autowired
    public TextFileDataTransformer(
            @Qualifier("worker-mapper") TextToObjectMapper<Worker> textToObjectMapper) {
        this.textToObjectMapper = textToObjectMapper;
    }


    @Override
    public List<Worker> transformRawDataToWorkerObjects(List<String> rawDataList) {
        return rawDataList.stream()
                .map(this::transformToWorker)
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
    }

    private Optional<Worker> transformToWorker(String rawTextData) {
        String[] splitData = rawTextData.split(CHAR_SPACE);
        if (splitData.length == WORKER_PROPS_NUMBER) {
            return Optional.of(textToObjectMapper.mapToObjects(splitData));
        }
        System.err.println("Incorrect data structure");
        return Optional.empty();
    }

    private static final String CHAR_SPACE = " ";
    private static final int WORKER_PROPS_NUMBER = 4;

}
