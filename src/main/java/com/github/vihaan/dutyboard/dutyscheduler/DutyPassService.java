package com.github.vihaan.dutyboard.dutyscheduler;

import com.github.vihaan.dutyboard.dutyboard.IBoard;
import com.github.vihaan.dutyboard.worker.Worker;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

public class DutyPassService {

    private List<Worker> workersList;

    public List<Worker> getWorkersList() {
        return workersList;
    }

    public void setWorkersList(List<Worker> workersList) {
        this.workersList = workersList;
    }

    public DutyPassService(List<Worker> workersList) {
        this.workersList = workersList;
    }

    @Scheduled(cron = "0 0 9 * 3 ?")
    public void reloadActiveDuty(){

    }
}
