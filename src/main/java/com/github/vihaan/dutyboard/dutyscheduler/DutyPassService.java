package com.github.vihaan.dutyboard.dutyscheduler;

import com.github.vihaan.dutyboard.dutyboard.Board;
import com.github.vihaan.dutyboard.dutyboard.BoardsService;
import com.github.vihaan.dutyboard.storage.Storage;
import com.github.vihaan.dutyboard.storage.factory.StorageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DutyPassService {

    private BoardsService boardsService;

    @Autowired
    private DutyPassService(BoardsService boardsService){
        this.boardsService = boardsService;
    }

    @Scheduled(cron = "0 0 9 * 3 ?")
    public void reloadActiveDuty() {
        boardsService.getBoards().forEach(this::changeWorkerOnDuty);
    }

    private void changeWorkerOnDuty(Board board) {
        board.changeDuty();
    }
}
