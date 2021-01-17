package com.github.vihaan.dutyboard.storage.file.text.mapper;

import com.github.vihaan.dutyboard.domain.dutyboard.Board;
import com.github.vihaan.dutyboard.domain.worker.Worker;
import com.github.vihaan.dutyboard.storage.Storage;
import com.github.vihaan.dutyboard.storage.file.TextToObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Collection;
import java.util.LinkedList;

@Qualifier("txt-board-mapper")
public class TextToBoardObjectMapper implements TextToObjectMapper<Board> {

    private final Storage dataStorage;

    @Autowired
    public TextToBoardObjectMapper(Storage dataStorage){
        this.dataStorage = dataStorage;
    }

    @Override
    public Board mapToObjects(String[] rawDataArray){
        String boardName = rawDataArray[0];
        String currentWorker = rawDataArray[1];
        Collection<Worker> workersList = setCollectionFromRawData(rawDataArray, BREAKER);
        String presenceText = rawDataArray[3];
        return null;
    }

    private Collection<Worker> setCollectionFromRawData (String[] rawDataArray, String breaker){
        LinkedList<Worker> workersList = new LinkedList<>();

        int index = (rawDataArray.length > 3 ? 2 : 3);
        do{


        }while(breaker.equals(rawDataArray[index]));

            return null;
    }

    private static final String BREAKER = "end-of-list";
}
