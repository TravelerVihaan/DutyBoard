package com.github.vihaan.dutyboard.storage.factory;

import com.github.vihaan.dutyboard.storage.Storage;
import com.github.vihaan.dutyboard.storage.StorageType;
import com.github.vihaan.dutyboard.storage.database.mongo.MongoStorage;
import com.github.vihaan.dutyboard.storage.database.sql.sqlite.SQLiteStorage;
import com.github.vihaan.dutyboard.storage.file.json.JsonFileStorage;
import com.github.vihaan.dutyboard.storage.file.text.TextFileStorage;

public class StorageFactory{

    public static Storage createStorage(StorageType storageType){

        return switch (storageType){
            case TEXT -> new TextFileStorage();
            case JSON -> new JsonFileStorage();
            case SQLITE -> new SQLiteStorage();
            case MONGO -> new MongoStorage();
        };
    }
}