package com.github.vihaan.dutyboard.dutyscheduler;

import com.github.vihaan.dutyboard.dutyboard.IBoard;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

public class DutyPassService {

    private List<IBoard> dutyBoards;

    @Scheduled(cron = "0 0 9 * 3 ?")
    public void reloadActiveDuty() {
        for(IBoard board : dutyBoards) {
            changeWorkerOnDuty(board);
        }
    }

    private void changeWorkerOnDuty(IBoard board){
        if(!board.getWorkerIterator().hasNext()) {
            board.setWorkersIterator(board.getAllWorkersOnBoard().iterator());
        }
        board.setActiveWorkerOnDuty(board.getWorkerIterator().next());
        }
}
