package com.github.vihaan.dutyboard.storage.file.text.mapper;

import com.github.vihaan.dutyboard.elements.dutyboard.Board;
import com.github.vihaan.dutyboard.elements.worker.Worker;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Collection;
import java.util.LinkedList;

@Qualifier("board-mapper")
public class TextToBoardObjectMapper implements TextToObjectMapper<Board>  {

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
