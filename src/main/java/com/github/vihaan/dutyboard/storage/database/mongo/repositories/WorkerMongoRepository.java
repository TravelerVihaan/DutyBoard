package com.github.vihaan.dutyboard.storage.database.mongo.repositories;

import com.github.vihaan.dutyboard.storage.database.mongo.entities.WorkerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerMongoRepository extends MongoRepository<WorkerEntity, String> {
}
