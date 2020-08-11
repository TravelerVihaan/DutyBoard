package com.github.vihaan.dutyboard.dutyscheduler;

import com.github.vihaan.dutyboard.dutyboard.Boards;
import org.springframework.scheduling.annotation.Scheduled;

public class DutyPassService {

    private Boards dutyBoards;

    @Scheduled(cron = "0 0 9 * 3 ?")
    public void reloadActiveDuty(){

    }
}
