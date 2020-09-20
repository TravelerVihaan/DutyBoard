package com.github.vihaan.dutyboard.storage;

public enum StorageType {
    TEXT(StorageConstants.TEXT_FILE_STORAGE),
    JSON(StorageConstants.JSON_FILE_STORAGE),
    SQLITE(StorageConstants.SQLITE_STORAGE),
    MONGO(StorageConstants.MONGO_STORAGE);

    String storageType;

    StorageType(String storageType) { this.storageType = storageType;}
}
