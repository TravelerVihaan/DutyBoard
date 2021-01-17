package com.github.vihaan.dutyboard.elements.dutyboard;

import com.github.vihaan.dutyboard.storage.Storage;
import com.github.vihaan.dutyboard.storage.StorageType;
import com.github.vihaan.dutyboard.storage.factory.StorageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BoardsService {

    private final StorageFactory storageFactory;
    private Storage storage;
    private Set<Board> boards;

    @Autowired
    public BoardsService(StorageFactory storageFactory){
        this.storageFactory = storageFactory;
    }

    private void getSpecificStorage(StorageType storageType){
        storage = storageFactory.createStorage(storageType);
    }

    public void prepareBoardsFromStorage(StorageType storageType){
        getSpecificStorage(storageType);
        boards = storage.getBoards();
    }

    public Set<Board> getBoards(){ return boards; }
}
