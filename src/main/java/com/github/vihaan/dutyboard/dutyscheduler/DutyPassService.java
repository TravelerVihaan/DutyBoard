package com.github.vihaan.dutyboard.dutyscheduler;

import com.github.vihaan.dutyboard.dutyboard.Boards;
import com.github.vihaan.dutyboard.dutyboard.IBoard;
import org.springframework.scheduling.annotation.Scheduled;

public class DutyPassService {

    private Boards dutyBoards;

    @Scheduled(cron = "0 0 9 * 3 ?")
    public void reloadActiveDuty() {
        dutyBoards.getBoards().values().stream().map(board -> changeWorkerOnDuty(board));
    }

    private void changeWorkerOnDuty(IBoard board){
        if(!board.getWorkerIterator().hasNext()) {
            board.getWorkerIterator();
        }
        board.setActiveWorkerOnDuty(board.getWorkerIterator().next());
        }
    }
}
