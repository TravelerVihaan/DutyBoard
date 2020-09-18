package com.github.vihaan.dutyboard.storage.database;

import com.github.vihaan.dutyboard.storage.database.mongo.repositories.DutyTypeMongoRepository;
import com.github.vihaan.dutyboard.storage.database.mongo.repositories.WorkerMongoRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class DataBaseFacade {
    private WorkerMongoRepository workerMongoRepository;
    private DutyTypeMongoRepository dutyTypeMongoRepository;

    public DataBaseFacade(WorkerMongoRepository workerMongoRepository, DutyTypeMongoRepository dutyTypeMongoRepository) {
        this.workerMongoRepository = workerMongoRepository;
        this.dutyTypeMongoRepository = dutyTypeMongoRepository;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataBaseFacade that = (DataBaseFacade) o;
        return Objects.equals(workerMongoRepository, that.workerMongoRepository) &&
                Objects.equals(dutyTypeMongoRepository, that.dutyTypeMongoRepository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workerMongoRepository, dutyTypeMongoRepository);
    }

    @Override
    public String toString() {
        return "DataBaseFacade{" +
                "workerRepository=" + workerMongoRepository +
                ", dutyTypeRepository=" + dutyTypeMongoRepository +
                '}';
    }
}
