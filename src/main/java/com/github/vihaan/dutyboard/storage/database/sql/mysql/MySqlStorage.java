package com.github.vihaan.dutyboard.storage.database.sql.mysql;

import com.github.vihaan.dutyboard.storage.database.sql.repositories.BoardJpaRepository;
import com.github.vihaan.dutyboard.storage.database.sql.repositories.DutyTypeJpaRepository;
import com.github.vihaan.dutyboard.storage.database.sql.repositories.PresenceJpaRepository;
import com.github.vihaan.dutyboard.storage.database.sql.repositories.WorkerJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MySqlStorage {

    private WorkerJpaRepository workerJpaRepository;
    private DutyTypeJpaRepository dutyTypeJpaRepository;
    private PresenceJpaRepository presenceJpaRepository;
    private BoardJpaRepository boardJpaRepository;

    @Autowired
    public MySqlStorage(WorkerJpaRepository workerJpaRepository,
                        DutyTypeJpaRepository dutyTypeJpaRepository,
                        PresenceJpaRepository presenceJpaRepository,
                        BoardJpaRepository boardJpaRepository) {
        this.workerJpaRepository = workerJpaRepository;
        this.dutyTypeJpaRepository = dutyTypeJpaRepository;
        this.presenceJpaRepository = presenceJpaRepository;
        this.boardJpaRepository = boardJpaRepository;
    }
}
