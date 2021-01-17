package com.github.vihaan.dutyboard.storage.file.text;

import com.github.vihaan.dutyboard.elements.worker.Worker;
import com.github.vihaan.dutyboard.elements.worker.presence.Presence;
import com.github.vihaan.dutyboard.storage.file.FileDataTransformer;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TextFileDataTransformer implements FileDataTransformer {

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
            return Optional.of(mapToWorker(splitData));
        }
        System.err.println("Incorrect data structure");
        return Optional.empty();
    }

    private Worker mapToWorker(String[] props){
        String name = props[0];
        String surname = props[1];
        String visibleName = props[2];
        String presenceText = props[3];
        return new Worker(name,surname,visibleName,setWorkerPresence(presenceText));
    }

    private Presence setWorkerPresence(String presenceText){
        return Boolean.parseBoolean(presenceText) ? Presence.PRESENT : Presence.ABSENT;
    }

    private static final String CHAR_SPACE = " ";
    private static final int WORKER_PROPS_NUMBER = 4;

}
