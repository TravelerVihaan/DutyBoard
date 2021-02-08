package com.github.vihaan.dutyboard.storage.factory;

import com.github.vihaan.dutyboard.storage.Storage;
import com.github.vihaan.dutyboard.storage.StorageType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class StorageFactory{

    private final Storage textFileStorage;
    private final Storage jsonFileStorage;
    private final Storage mongoStorage;

    @Autowired
    public StorageFactory(@Qualifier("text-storage") Storage textFileStorage,
                          @Qualifier("json-storage") Storage jsonFileStorage,
                          @Qualifier("mongo-storage") Storage mongoStorage
                          ){
        this.textFileStorage = textFileStorage;
        this.jsonFileStorage = jsonFileStorage;
        this.mongoStorage = mongoStorage;
    }

    public Storage createStorage(StorageType storageType){

        return switch (storageType){
            case TEXT -> textFileStorage;
            case JSON -> jsonFileStorage;
            case MONGO -> mongoStorage;
        };
    }
}