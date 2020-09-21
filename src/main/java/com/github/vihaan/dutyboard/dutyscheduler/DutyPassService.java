package com.github.vihaan.dutyboard.dutyscheduler;

import com.github.vihaan.dutyboard.dutyboard.Board;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

public class DutyPassService {

    private List<Board> dutyBoards;

    @Scheduled(cron = "0 0 9 * 3 ?")
    public void reloadActiveDuty() {
        for(Board board : dutyBoards) {
            changeWorkerOnDuty(board);
        }
    }

    private void changeWorkerOnDuty(Board board) {
        board.changeDuty();
    }
}
