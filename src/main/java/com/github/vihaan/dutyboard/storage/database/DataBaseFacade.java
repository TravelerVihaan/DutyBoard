package com.github.vihaan.dutyboard.storage.database;

import com.github.vihaan.dutyboard.storage.database.mongo.DutyTypeRepository;
import com.github.vihaan.dutyboard.storage.database.mongo.WorkerRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class DataBaseFacade {
    private WorkerRepository workerRepository;
    private DutyTypeRepository dutyTypeRepository;

    public DataBaseFacade(WorkerRepository workerRepository, DutyTypeRepository dutyTypeRepository) {
        this.workerRepository = workerRepository;
        this.dutyTypeRepository = dutyTypeRepository;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataBaseFacade that = (DataBaseFacade) o;
        return Objects.equals(workerRepository, that.workerRepository) &&
                Objects.equals(dutyTypeRepository, that.dutyTypeRepository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workerRepository, dutyTypeRepository);
    }

    @Override
    public String toString() {
        return "DataBaseFacade{" +
                "workerRepository=" + workerRepository +
                ", dutyTypeRepository=" + dutyTypeRepository +
                '}';
    }
}
