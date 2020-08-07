package com.github.vihaan.dutyboard.converter;

import com.github.vihaan.dutyboard.worker.Worker;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WorkerConverter {

    public Worker convertStringToWorker(String workerString){
        List<String> workerInfo = Arrays.stream(workerString.split(CHAR_EMPTY_SPACE))
                .map(String::trim)
                .collect(Collectors.toList());
        if(workerInfo.size() != 3){

        }
        return null;
    }

    private static final String CHAR_EMPTY_SPACE = " ";
}
