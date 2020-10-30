package com.github.vihaan.dutyboard.dutyboard;

import com.github.vihaan.dutyboard.storage.Storage;
import com.github.vihaan.dutyboard.storage.StorageType;
import com.github.vihaan.dutyboard.storage.factory.StorageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BoardsService {

    private StorageFactory storageFactory;
    private Storage storage;
    private Set<Board> boards;

    @Autowired
    public BoardsService(StorageFactory storageFactory){
        this.storageFactory = storageFactory;
    }

    public void getSpecificStorage(StorageType storageType){
        storage = storageFactory.createStorage(storageType);
    }

    void prepareBoardsFromStorage(){
        boards = storage.getBoards();
    }

    public Set<Board> getBoards(){ return boards; }
}
