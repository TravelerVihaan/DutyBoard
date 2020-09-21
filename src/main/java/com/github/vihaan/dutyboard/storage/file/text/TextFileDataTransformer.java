package com.github.vihaan.dutyboard.storage.file.text;

import com.github.vihaan.dutyboard.storage.file.FileDataTransformer;
import com.github.vihaan.dutyboard.worker.Worker;
import com.github.vihaan.dutyboard.worker.presence.Presence;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextFileDataTransformer implements FileDataTransformer {

    @Override
    public List<Worker> transformRawDataToWorkerObjects(List<String> rawDataList) {
        return rawDataList.stream()
                .map(this::transformToWorker)
                .flatMap( worker -> worker.stream().flatMap(Stream::of))
                .collect(Collectors.toList());
    }

    private Optional<Worker> transformToWorker(String rawTextData) {
        String[] splitData = rawTextData.split(CHAR_SPACE);
        if (splitData.length == WORKER_PROPS_NUMBER) {
            return Optional.of(mapToWorker(splitData));
        }
        return Optional.empty();
    }

    private Worker mapToWorker(String[] props){
        String name = props[0];
        String surname = props[1];
        String visibleName = props[2];
        String presenceText = props[3];
        Worker worker = new Worker(name,surname,visibleName,null);

        if(Boolean.parseBoolean(presenceText))
            worker.setPresence(Presence.PRESENT);
        else
            worker.setPresence(Presence.ABSENT);

        return worker;
    }

    private static final String CHAR_SPACE = " ";
    private static final int WORKER_PROPS_NUMBER = 4;

}
