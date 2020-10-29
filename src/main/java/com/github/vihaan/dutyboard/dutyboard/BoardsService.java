package com.github.vihaan.dutyboard.dutyboard;

import com.github.vihaan.dutyboard.storage.factory.StorageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardsService {

    private StorageFactory storageFactory;

    @Autowired
    public BoardsService(StorageFactory storageFactory){
        this.storageFactory = storageFactory;
    }


}
