package com.github.vihaan.dutyboard.dutyscheduler;

import com.github.vihaan.dutyboard.dutyboard.Boards;
import com.github.vihaan.dutyboard.dutyboard.IBoard;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Map;

public class DutyPassService {

    private Boards dutyBoards;

    @Scheduled(cron = "0 0 9 * 3 ?")
    public void reloadActiveDuty() {
        Map<String,IBoard> boards = dutyBoards.getBoards();
        for(IBoard board : boards.values()) {
            changeWorkerOnDuty(board);
        }
    }

    private void changeWorkerOnDuty(IBoard board){
        if(!board.getWorkerIterator().hasNext()) {
            board.getWorkerIterator();
        }
        board.setActiveWorkerOnDuty(board.getWorkerIterator().next());
        }
}
